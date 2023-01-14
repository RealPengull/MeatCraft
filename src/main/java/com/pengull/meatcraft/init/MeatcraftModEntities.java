
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.pengull.meatcraft.entity.TestEntity;
import com.pengull.meatcraft.entity.DreamEntity;
import com.pengull.meatcraft.entity.AnvilGunEntity;
import com.pengull.meatcraft.MeatcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MeatcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MeatcraftMod.MODID);
	public static final RegistryObject<EntityType<TestEntity>> TEST = register("test",
			EntityType.Builder.<TestEntity>of(TestEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TestEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DreamEntity>> DREAM = register("dream",
			EntityType.Builder.<DreamEntity>of(DreamEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DreamEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AnvilGunEntity>> ANVIL_GUN = register("projectile_anvil_gun",
			EntityType.Builder.<AnvilGunEntity>of(AnvilGunEntity::new, MobCategory.MISC).setCustomClientFactory(AnvilGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TestEntity.init();
			DreamEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TEST.get(), TestEntity.createAttributes().build());
		event.put(DREAM.get(), DreamEntity.createAttributes().build());
	}
}
