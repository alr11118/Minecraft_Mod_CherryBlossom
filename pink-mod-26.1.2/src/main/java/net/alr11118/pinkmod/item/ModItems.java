package net.alr11118.pinkmod.item;

import net.alr11118.pinkmod.PinkMod;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.Properties;
import java.util.function.Function;

public class ModItems {
    public static final Item PINKGOLD = registerItem("pink_gold", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, name)))));
    }

    public static final Item PINKGOLD_SWORD = registerItem("pinkgold_sword",
            properties -> new Item(properties.sword(ModToolMaterials.PINKGOLD, 3, -2.4f)));
    public static final Item PINKGOLD_PICKAXE = registerItem("pinkgold_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.PINKGOLD, 1, -2.8f)));
    public static final Item PINKGOLD_SHOVEL = registerItem("pinkgold_shovel",
            properties -> new ShovelItem(ModToolMaterials.PINKGOLD, 1.5f, -3.0f, properties));
    public static final Item PINKGOLD_AXE = registerItem("pinkgold_axe",
            properties -> new AxeItem(ModToolMaterials.PINKGOLD, 6f, -3.2f, properties));
    public static final Item PINKGOLD_HOE = registerItem("pinkgold_hoe",
            properties -> new HoeItem(ModToolMaterials.PINKGOLD, 0f, -3.0f, properties));

    public static final Item PINKGOLD_HELMET = registerItem("pinkgold_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINKGOLD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item PINKGOLD_CHESTPLATE = registerItem("pinkgold_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINKGOLD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item PINKGOLD_LEGGINGS = registerItem("pinkgold_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINKGOLD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item PINKGOLD_BOOTS = registerItem("pinkgold_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.PINKGOLD_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static void registerModItems() {
        PinkMod.LOGGER.info("Registering Mod Items for " + PinkMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(PINKGOLD);
        });
    }
}
