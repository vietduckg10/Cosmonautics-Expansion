package com.ducvn.cosmonauticsexpansionmod.datagen;

import com.ducvn.cosmonauticsexpansionmod.CosmonauticsExpansionMod;
import com.ducvn.cosmonauticsexpansionmod.worldgen.ModBiomeModifiers;
import com.ducvn.cosmonauticsexpansionmod.worldgen.ModConfiguredFeatures;
import com.ducvn.cosmonauticsexpansionmod.worldgen.ModPlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    public ModDatapackProvider(PackOutput output, CompletableFuture<RegistrySetBuilder.PatchedRegistries> registries) {
        super(output, registries, Set.of(CosmonauticsExpansionMod.MODID));
    }
}
