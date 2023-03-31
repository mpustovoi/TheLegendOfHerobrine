package com.herobrinemod.herobrine.client.entities.models;

import com.herobrinemod.herobrine.HerobrineMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class HerobrineModelLayers {
    public static final EntityModelLayer HEROBRINE_MODEL_LAYER = new EntityModelLayer(new Identifier(HerobrineMod.MODID, "herobrine"), "main");
    public static final EntityModelLayer HEROBRINE_MAGE_MODEL_LAYER = new EntityModelLayer(new Identifier(HerobrineMod.MODID, "herobrine_mage"), "main");
    public static final EntityModelLayer INFECTED_PIG_MODEL_LAYER = new EntityModelLayer(new Identifier(HerobrineMod.MODID, "infected_pig"), "main");
    public static final EntityModelLayer INFECTED_COW_MODEL_LAYER = new EntityModelLayer(new Identifier(HerobrineMod.MODID, "infected_cow"), "main");
    public static final EntityModelLayer INFECTED_VILLAGER_MODEL_LAYER = new EntityModelLayer(new Identifier(HerobrineMod.MODID, "infected_villager"), "main");
}
