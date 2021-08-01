package net.mcreator.therazorhailmod.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.therazorhailmod.TherazorhailModModElements;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;

@TherazorhailModModElements.ModElement.Tag
public class HeavyTF2EntityDiesProcedure extends TherazorhailModModElements.ModElement {
	public HeavyTF2EntityDiesProcedure(TherazorhailModModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency world for procedure HeavyTF2EntityDies!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("https://www.youtube.com/watch?v=XOJKQQ4QzOI"), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
	}
}
