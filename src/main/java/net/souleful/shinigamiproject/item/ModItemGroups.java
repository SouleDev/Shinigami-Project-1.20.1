package net.souleful.shinigamiproject.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.souleful.shinigamiproject.ShinigamiProject;
import net.souleful.shinigamiproject.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShinigamiProject.MOD_ID, "bleach"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bleach"))
                    .icon(() -> new ItemStack(ModItems.BLEACH)).entries((displayContext, entries) -> {
                        //Combat Items
                        entries.add(ModItems.ZANPAKUTO);
                        //Blocks
                        entries.add(ModBlocks.WHITE_SAND);





                    }).build());


    public static void registerItemGroups() {
        ShinigamiProject.LOGGER.info("Registering Item Groups for " + ShinigamiProject.MOD_ID);
    }
}