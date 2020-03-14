package net.rinsuki.mcmods.syphoninjector;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = SyphonInjector.MODID, version = SyphonInjector.VERSION)
public class SyphonInjector {
    public static final String MODID = "syphoninject";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.load(
                "/Applications/SyphonInject.app/Contents/Resources/SyphonPayload.bundle/Contents/MacOS/SyphonPayload");
    }
}
