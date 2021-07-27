package net.mcreator.therazorhailmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.TherazorhailModModElements;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;

@TherazorhailModModElements.ModElement.Tag
public class BeerFoodEatenProcedure extends TherazorhailModModElements.ModElement {
	public BeerFoodEatenProcedure(TherazorhailModModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure BeerFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 1200, (int) 1, (false), (false)));
	}
}
