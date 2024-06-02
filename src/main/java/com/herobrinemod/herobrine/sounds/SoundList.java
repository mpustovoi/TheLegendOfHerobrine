package com.herobrinemod.herobrine.sounds;

import com.herobrinemod.herobrine.HerobrineMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundList {
    public static final Identifier MUSIC_DISC_DOG = Identifier.of(HerobrineMod.MODID, "music_disc_dog");
    public static final Identifier HEROBRINE_ALTAR_CURSED_IDENTIFIER = Identifier.of(HerobrineMod.MODID, "herobrine_altar_cursed");
    public static final SoundEvent HEROBRINE_ALTAR_CURSED = SoundEvent.of(HEROBRINE_ALTAR_CURSED_IDENTIFIER);
    public static final Identifier HEROBRINE_ALTAR_PURIFIED_IDENTIFIER = Identifier.of(HerobrineMod.MODID, "herobrine_altar_purified");
    public static final SoundEvent HEROBRINE_ALTAR_PURIFIED = SoundEvent.of(HEROBRINE_ALTAR_PURIFIED_IDENTIFIER);
}
