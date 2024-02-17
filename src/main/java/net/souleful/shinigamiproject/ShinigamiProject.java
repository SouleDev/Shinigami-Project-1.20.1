package net.souleful.shinigamiproject;

import net.fabricmc.api.ModInitializer;


import net.souleful.shinigamiproject.block.ModBlocks;
import net.souleful.shinigamiproject.item.ModItemGroups;
import net.souleful.shinigamiproject.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShinigamiProject implements ModInitializer {
public static final String MOD_ID = "shinigamiproject";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}