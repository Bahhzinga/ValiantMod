package net.bahzinga.valiant.setup;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {

    public static final Food CURED_FLESH = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.SPEED, 100, 2), 0.5f)
            .effect(() -> new EffectInstance(Effects.POISON, 60), 0.05f).fastToEat().hunger(2).saturation(0.2f)
            .setAlwaysEdible().build();

    public static final Food SUSHI = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.SPEED, 100, 2), 0.5f)
            .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 60), 0.05f).fastToEat().hunger(2).saturation(0.2f)
            .setAlwaysEdible().build();

}
