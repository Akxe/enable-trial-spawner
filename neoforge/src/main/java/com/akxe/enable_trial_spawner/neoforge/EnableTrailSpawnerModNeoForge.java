package com.akxe.enable_trial_spawner.neoforge;

import net.neoforged.fml.common.Mod;

import com.akxe.enable_trial_spawner.EnableTrailSpawnerMod;

@Mod(EnableTrailSpawnerMod.MOD_ID)
public final class EnableTrailSpawnerModNeoForge {
    public EnableTrailSpawnerModNeoForge() {
        // Run our common setup.
        EnableTrailSpawnerMod.init();
    }
}
