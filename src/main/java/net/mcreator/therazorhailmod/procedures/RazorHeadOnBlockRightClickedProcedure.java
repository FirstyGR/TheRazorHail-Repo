package net.mcreator.therazorhailmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.therazorhailmod.entity.RazorBossEntity;
import net.mcreator.therazorhailmod.TherazorhailModModElements;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;

@TherazorhailModModElements.ModElement.Tag
public class RazorHeadOnBlockRightClickedProcedure extends TherazorhailModModElements.ModElement {
	public RazorHeadOnBlockRightClickedProcedure(TherazorhailModModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency x for procedure RazorHeadOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency y for procedure RazorHeadOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency z for procedure RazorHeadOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency world for procedure RazorHeadOnBlockRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new RazorBossEntity.CustomEntity(RazorBossEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
			entityToSpawn.setRenderYawOffset((float) 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
	}
}
