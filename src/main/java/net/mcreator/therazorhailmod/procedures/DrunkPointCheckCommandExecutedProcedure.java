package net.mcreator.therazorhailmod.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.TherazorhailModModVariables;
import net.mcreator.therazorhailmod.TherazorhailModModElements;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;

@TherazorhailModModElements.ModElement.Tag
public class DrunkPointCheckCommandExecutedProcedure extends TherazorhailModModElements.ModElement {
	public DrunkPointCheckCommandExecutedProcedure(TherazorhailModModElements instance) {
		super(instance, 16);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure DrunkPointCheckCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency world for procedure DrunkPointCheckCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(
						new StringTextComponent(("" + (((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer)))),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
