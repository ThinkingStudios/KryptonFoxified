package org.thinkingstudio.krypton_foxified;

import me.steinborn.krypton.mod.client.KryptonClientInitializer;
import me.steinborn.krypton.mod.server.KryptonServerInitializer;
import me.steinborn.krypton.mod.shared.KryptonSharedInitializer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;

@Mod("krypton")
public class KryptonFoxified {
    public KryptonFoxified() {
        KryptonSharedInitializer.onInitialize();

        if (FMLLoader.getDist().isClient()) {
            KryptonClientInitializer.onInitializeClient();
        }

        if (FMLLoader.getDist().isDedicatedServer()) {
            KryptonServerInitializer.onInitializeServer();
        }
    }
}
