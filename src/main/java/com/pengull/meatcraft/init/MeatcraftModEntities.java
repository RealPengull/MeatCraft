
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

import com.pengull.meatcraft.entity.SuperAppleBombEntity;
import com.pengull.meatcraft.entity.StickybombEntity;
import com.pengull.meatcraft.entity.PepigEntity;
import com.pengull.meatcraft.entity.GodlyAppleBombEntity;
import com.pengull.meatcraft.entity.DreamEntity;
import com.pengull.meatcraft.entity.AnvilGunEntity;
import com.pengull.meatcraft.MeatcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MeatcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MeatcraftMod.MODID);
	public static final RegistryObject<EntityType<DreamEntity>> DREAM = register("dream",
			EntityType.Builder.<DreamEntity>of(DreamEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DreamEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AnvilGunEntity>> ANVIL_GUN = register("projectile_anvil_gun",
			EntityType.Builder.<AnvilGunEntity>of(AnvilGunEntity::new, MobCategory.MISC).setCustomClientFactory(AnvilGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PepigEntity>> PEPIG = register("pepig",
			EntityType.Builder.<PepigEntity>of(PepigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PepigEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<StickybombEntity>> APPLEBOMB = register("projectile_applebomb",
			EntityType.Builder.<StickybombEntity>of(StickybombEntity::new, MobCategory.MISC).setCustomClientFactory(StickybombEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SuperAppleBombEntity>> SUPER_APPLE_BOMB = register("projectile_super_apple_bomb",
			EntityType.Builder.<SuperAppleBombEntity>of(SuperAppleBombEntity::new, MobCategory.MISC).setCustomClientFactory(SuperAppleBombEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GodlyAppleBombEntity>> GODLY_APPLE_BOMB = register("projectile_godly_apple_bomb",
			EntityType.Builder.<GodlyAppleBombEntity>of(GodlyAppleBombEntity::new, MobCategory.MISC).setCustomClientFactory(GodlyAppleBombEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DreamEntity.init();
			PepigEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DREAM.get(), DreamEntity.createAttributes().build());
		event.put(PEPIG.get(), PepigEntity.createAttributes().build());
	}
}
