
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.pengull.meatcraft.MeatcraftMod;

public class MeatcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MeatcraftMod.MODID);
	public static final RegistryObject<SoundEvent> BRUH = REGISTRY.register("bruh", () -> new SoundEvent(new ResourceLocation("meatcraft", "bruh")));
	public static final RegistryObject<SoundEvent> ASCEND = REGISTRY.register("ascend",
			() -> new SoundEvent(new ResourceLocation("meatcraft", "ascend")));
	public static final RegistryObject<SoundEvent> SPEEDRUN = REGISTRY.register("speedrun",
			() -> new SoundEvent(new ResourceLocation("meatcraft", "speedrun")));
	public static final RegistryObject<SoundEvent> FORTNITE_DEFAULT_DANCE = REGISTRY.register("fortnite_default_dance",
			() -> new SoundEvent(new ResourceLocation("meatcraft", "fortnite_default_dance")));
	public static final RegistryObject<SoundEvent> CARTOON_THROW = REGISTRY.register("cartoon_throw",
			() -> new SoundEvent(new ResourceLocation("meatcraft", "cartoon_throw")));
	public static final RegistryObject<SoundEvent> GODLYAPPLE = REGISTRY.register("godlyapple",
			() -> new SoundEvent(new ResourceLocation("meatcraft", "godlyapple")));
}
