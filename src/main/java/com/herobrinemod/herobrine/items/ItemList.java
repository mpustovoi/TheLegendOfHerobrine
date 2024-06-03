package com.herobrinemod.herobrine.items;

import com.herobrinemod.herobrine.HerobrineMod;
import com.herobrinemod.herobrine.blocks.BlockList;
import com.herobrinemod.herobrine.component.DataComponentTypeList;
import com.herobrinemod.herobrine.entities.EntityTypeList;
import com.herobrinemod.herobrine.items.material.ArmorMaterialList;
import com.herobrinemod.herobrine.items.material.ToolMaterialList;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ItemList {
    // Initialize items
    public static final Item BEDROCK_SWORD = new SwordItem(ToolMaterialList.BEDROCK, new Item.Settings().customDamage((stack, amount, entity, slot, breakCallback) -> 0).rarity(Rarity.EPIC).attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterialList.BEDROCK, 0, -2.4f)));
    public static final Item CURSED_DIAMOND = new Item(new Item.Settings());
    public static final Item CURSED_DUST = new Item(new Item.Settings());
    public static final Item PURIFIED_DIAMOND = new Item(new Item.Settings());
    public static final Item CURSED_DIAMOND_HELMET = new ArmorItem(ArmorMaterialList.CURSED_DIAMOND, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)));
    public static final Item CURSED_DIAMOND_CHESTPLATE = new ArmorItem(ArmorMaterialList.CURSED_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33)));
    public static final Item CURSED_DIAMOND_LEGGINGS = new ArmorItem(ArmorMaterialList.CURSED_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33)));
    public static final Item CURSED_DIAMOND_BOOTS = new ArmorItem(ArmorMaterialList.CURSED_DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33)));
    public static final Item CURSED_DIAMOND_SWORD = new CursedDiamondSwordItem(ToolMaterialList.CURSED_DIAMOND, new Item.Settings().component(DataComponentTypeList.KILLS, 0).attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterialList.CURSED_DIAMOND, 3, -2.4f)));
    public static final Item CURSED_DIAMOND_AXE = new CursedDiamondAxeItem(ToolMaterialList.CURSED_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterialList.CURSED_DIAMOND, 5.0f, -3.0f)));
    public static final Item CURSED_DIAMOND_PICKAXE = new PickaxeItem(ToolMaterialList.CURSED_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterialList.CURSED_DIAMOND, 1.0f, -2.8f)));
    public static final Item CURSED_DIAMOND_SHOVEL = new ShovelItem(ToolMaterialList.CURSED_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterialList.CURSED_DIAMOND, 1.5f, -3.0f)));
    public static final Item CURSED_DIAMOND_HOE = new CursedDiamondHoeItem(ToolMaterialList.CURSED_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterialList.CURSED_DIAMOND, -4.0f, -0.0f)));
    public static final Item MUSIC_DISC_DOG = new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(HerobrineMod.MODID, "dog"))));
    public static final Item HOLY_WATER = new HolyWaterItem(new Item.Settings());
    public static final Item UNHOLY_WATER = new UnholyWaterItem(new Item.Settings());
    public static final Item CURSED_DIAMOND_BLOCK = new BlockItem(BlockList.CURSED_DIAMOND_BLOCK, new Item.Settings());
    public static final Item PURIFIED_DIAMOND_BLOCK = new BlockItem(BlockList.PURIFIED_DIAMOND_BLOCK, new Item.Settings());
    public static final Item HEROBRINE_ALTAR = new BlockItem(BlockList.HEROBRINE_ALTAR_BLOCK, new Item.Settings().rarity(Rarity.UNCOMMON));
    public static final Item HEROBRINE_STATUE = new BlockItem(BlockList.HEROBRINE_STATUE_BLOCK, new Item.Settings());
    public static final SpawnEggItem HEROBRINE_WARRIOR_SPAWN_EGG = new SpawnEggItem(EntityTypeList.HEROBRINE_WARRIOR, 0x000000, 0xFF0000, new Item.Settings());
    public static final SpawnEggItem HEROBRINE_SPY_SPAWN_EGG = new SpawnEggItem(EntityTypeList.HEROBRINE_SPY, 0x000000, 0x00FF00, new Item.Settings());
    public static final SpawnEggItem HEROBRINE_MAGE_SPAWN_EGG = new SpawnEggItem(EntityTypeList.HEROBRINE_MAGE, 0x000000, 0x0000FF, new Item.Settings());
    public static final SpawnEggItem HEROBRINE_BUILDER_SPAWN_EGG = new SpawnEggItem(EntityTypeList.HEROBRINE_BUILDER, 0x000000, 0xFFFF00, new Item.Settings());
    public static final SpawnEggItem HEROBRINE_STALKER_SPAWN_EGG = new SpawnEggItem(EntityTypeList.HEROBRINE_STALKER, 0x000000, 0xFFA500, new Item.Settings());
    public static final SpawnEggItem INFECTED_PIG_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_PIG, 0xF0A5A2, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_COW_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_COW, 0x443626, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_VILLAGER_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_VILLAGER, 0x563C33, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_CHICKEN_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_CHICKEN, 0xA1A1A1, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_SHEEP_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_SHEEP, 0xE7E7E7, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_BAT_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_BAT, 0x4C3E30, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_WOLF_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_WOLF, 0xD7D3D3, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_MOOSHROOM_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_MOOSHROOM, 0xA00F10, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_DONKEY_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_DONKEY, 0x534539, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_HORSE_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_HORSE, 0xC09E7D, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_LLAMA_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_LLAMA, 0xC09E7D, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_RABBIT_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_RABBIT, 0x995F40, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem SURVIVOR_SPAWN_EGG = new SpawnEggItem(EntityTypeList.SURVIVOR, 0x46B59C, 0xCEAC90, new Item.Settings());
    public static final SpawnEggItem INFECTED_AXOLOTL_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_AXOLOTL, 0xFBC1E3, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_CAMEL_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_CAMEL, 0xFCC369, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_ARMADILLO_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_ARMADILLO, 0xAD716D, 0xFFFFFF, new Item.Settings());
    public static final SpawnEggItem INFECTED_OCELOT_SPAWN_EGG = new SpawnEggItem(EntityTypeList.INFECTED_OCELOT, 0xEFDE7D, 0xFFFFFF, new Item.Settings());
}