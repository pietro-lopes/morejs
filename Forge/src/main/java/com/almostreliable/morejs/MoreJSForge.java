package com.almostreliable.morejs;

import com.almostreliable.morejs.core.ReloadListener;
import com.almostreliable.morejs.features.TeleportFeatureLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(BuildConfig.MOD_ID)
public class MoreJSForge {

    public MoreJSForge() {
        MinecraftForge.EVENT_BUS.addListener(this::reloadListener);
        TeleportFeatureLoader.load(MinecraftForge.EVENT_BUS);
    }

    private void reloadListener(AddReloadListenerEvent event) {
        event.addListener(new ReloadListener());
    }
}
