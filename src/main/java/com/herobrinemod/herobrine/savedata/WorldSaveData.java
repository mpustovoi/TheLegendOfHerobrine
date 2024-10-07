package com.herobrinemod.herobrine.savedata;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WorldSavePath;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class WorldSaveData {
    private JsonObject json; // Allows loading the json data file to memory
    private final String fileName; // Store the name of the Json file
    private final String jsonPath;
    private boolean dirty;
    public WorldSaveData(@NotNull MinecraftServer server, String fileName) {
        this.fileName = fileName;
        String path = Objects.requireNonNull(server).getSavePath(WorldSavePath.ROOT).toString();
        this.jsonPath = path.substring(0, path.length() - 1) + fileName;
        try {
            this.json = (JsonObject) JsonParser.parseReader(new FileReader(jsonPath)); // Loads json file to memory so the game does not need to read from the disk every time
        } catch (FileNotFoundException e) {
            this.json = null;
        }
    }

    // Read integer from json file
    public int readInt(String dataName) {
        if(json == null || json.get(dataName) == null) {
            return 0;
        }
        return json.get(dataName).getAsInt();
    }

    // Read double from json file
    public double readDouble(String dataName) {
        if(json == null || json.get(dataName) == null) {
            return 0.0;
        }
        return json.get(dataName).getAsDouble();
    }

    // Read boolean from json file
    public boolean readBoolean(String dataName) {
        if(json == null || json.get(dataName) == null) {
            return false;
        }
        return json.get(dataName).getAsBoolean();
    }

    // Write integer value to json file
    public void writeInt(String dataName, int dataValue) {
        if(json == null) {
            json = new JsonObject();
        }
        json.addProperty(dataName, dataValue);
        this.dirty = true;
    }
    public void writeInt(String dataName, int dataValue, boolean saveNow) {
        if(json == null) {
            json = new JsonObject();
        }
        json.addProperty(dataName, dataValue);

        if(saveNow) {
            saveFile();
            return;
        }
        this.dirty = true;
    }

    // Write double value to json file
    public void writeDouble(String dataName, double dataValue) {
        if(json == null) {
            json = new JsonObject();
        }
        json.addProperty(dataName, dataValue);
        this.dirty = true;
    }
    public void writeDouble(String dataName, double dataValue, boolean saveNow) {
        if(json == null) {
            json = new JsonObject();
        }
        json.addProperty(dataName, dataValue);

        if(saveNow) {
            saveFile();
            return;
        }
        this.dirty = true;
    }

    // Write boolean value to json file
    public void writeBoolean(String dataName, boolean dataValue) {
        if(json == null) {
            json = new JsonObject();
        }
        json.addProperty(dataName, dataValue);
        this.dirty = true;
    }
    public void writeBoolean(String dataName, boolean dataValue, boolean saveNow) {
        if(json == null) {
            json = new JsonObject();
        }
        json.addProperty(dataName, dataValue);

        if(saveNow) {
            saveFile();
            return;
        }
        this.dirty = true;
    }

    public void saveFile() {
        this.dirty = false;
        try {
            Files.write(Paths.get(jsonPath), json.toString().getBytes());
        } catch (IOException e) {
            System.out.println("[The Legend of Herobrine/Save Data/ERROR]: Failed to save data to JSON file!");
            e.printStackTrace();
            this.dirty = true;
        }
    }

    public boolean isDirty() {
        return dirty;
    }

    // Get Json file in memory
    public JsonObject getJson() {
        return json;
    }

    // Return name of the Json file in memory
    public String getFileName() {
        return fileName;
    }
}