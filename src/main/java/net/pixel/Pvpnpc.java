package net.pixel;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.tinyremapper.extension.mixin.common.Logger;

public class Pvpnpc implements ModInitializer {
    public static String Mod_ID = "pvp_npc";
    @Override
    public void onInitialize() {
        System.out.println("Mod with id of"+ Mod_ID + "Started");

    }
}
