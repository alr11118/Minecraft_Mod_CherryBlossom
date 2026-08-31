package net.alr11118.pinkmod.item;

import net.alr11118.pinkmod.PinkMod;
import net.alr11118.pinkmod.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> PINKGOLD_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, "pinkgold"));

    public static final ArmorMaterial PINKGOLD_ARMOR_MATERIAL = new ArmorMaterial(750,
            ArmorMaterials.makeDefense(2, 4, 6, 2, 10),
            20, SoundEvents.ARMOR_EQUIP_GOLD, 0, 0, ModTags.Items.PINKGOLD_REPAIR, PINKGOLD_KEY);

}