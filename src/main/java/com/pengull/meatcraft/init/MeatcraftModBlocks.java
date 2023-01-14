
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.pengull.meatcraft.block.MeatTableBlock;
import com.pengull.meatcraft.MeatcraftMod;

public class MeatcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MeatcraftMod.MODID);
	public static final RegistryObject<Block> MEAT_TABLE = REGISTRY.register("meat_table", () -> new MeatTableBlock());
}
