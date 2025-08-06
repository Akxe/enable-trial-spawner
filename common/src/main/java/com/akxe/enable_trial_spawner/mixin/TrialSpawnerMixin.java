package com.akxe.enable_trial_spawner.mixin;

import net.minecraft.world.Difficulty;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.trialspawner.TrialSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TrialSpawner.class)
public class TrialSpawnerMixin {

    /**
     * Inject into canSpawnInLevel to allow trial spawners to spawn mobs even if doMobSpawning is false,
     * but NOT in Peaceful difficulty.
     * This matches vanilla mob spawner behavior.
     * @author Akxe
     * @reason To match vanilla mob spawner logic for trial spawners.
     */
    @Inject(method = "canSpawnInLevel", at = @At("HEAD"), cancellable = true)
    public void canSpawnInLevel(Level level, CallbackInfoReturnable<Boolean> cir) {
        // Return false only if difficulty is peaceful
        if (level.getDifficulty() == Difficulty.PEACEFUL) {
            cir.setReturnValue(false);
        } else {
            // Always return true for non-peaceful difficulties (ignoring doMobSpawning gamerule)
            cir.setReturnValue(true);
        }
    }
}
