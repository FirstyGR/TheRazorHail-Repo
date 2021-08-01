package net.mcreator.therazorhailmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.TherazorhailModModVariables;
import net.mcreator.therazorhailmod.TherazorhailModModElements;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;
import java.util.HashMap;

@TherazorhailModModElements.ModElement.Tag
public class DrunkPointCodeProcedure extends TherazorhailModModElements.ModElement {
	public DrunkPointCodeProcedure(TherazorhailModModElements instance) {
		super(instance, 15);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure DrunkPointCode!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) > 0)) {
			{
				double _setval = (double) (((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) - 1);
				entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HowDruckIsThePlayer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) < 0)) {
			{
				double _setval = (double) 0;
				entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HowDruckIsThePlayer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}

	@SubscribeEvent
	public void onEntityEndSleep(PlayerWakeUpEvent event) {
		Entity entity = event.getEntity();
		World world = entity.world;
		double i = entity.getPosX();
		double j = entity.getPosY();
		double k = entity.getPosZ();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
