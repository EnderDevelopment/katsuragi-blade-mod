package com.enderdevelopment.kyokusui;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class kyokusuiMod implements ModInitializer {
    public static final String MOD_ID = "kyokusui";
    public static final Item KYOKUSUI_SWORD = new Item(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "kyokusui_sword"), KYOKUSUI_SWORD);
    }
}