package net.souleful.shinigamiproject.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.souleful.shinigamiproject.ShinigamiProject;

public class ModItems {
    public static final Item BLEACH = registerItem("bleach", new Item(new FabricItemSettings()));
    public static final Item ZANPAKUTO = registerItem("zanpakuto", new Item(new FabricItemSettings()));
    public static final Item ACCESSORY = registerItem("accessory", new Item(new FabricItemSettings()));
    public static final Item TORSO = registerItem("torso", new Item(new FabricItemSettings()));
    public static final Item BOTTOM = registerItem("bottom", new Item(new FabricItemSettings()));
    public static final Item FEET = registerItem("feet", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLEACH);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ShinigamiProject.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ShinigamiProject.LOGGER.info("Registering Mod Items for" + ShinigamiProject.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
