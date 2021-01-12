package net.bahzinga.valiant.setup.customitems;

import net.bahzinga.valiant.setup.ModItems;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class MyraniumAxe extends AxeItem {

    public static IItemTier ruby_tier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 500;
        }

        @Override
        public float getEfficiency() {
            return 4.5F;
        }

        @Override
        public float getAttackDamage() {
            return -490F;
        }

        @Override
        public int getHarvestLevel() {
            return 3; // 0: wood, 1: stone/gold, 2: iron, 3: diamond
        }

        @Override
        public int getEnchantability() {
            return 25;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ModItems.RUBY.get());
        }
    };

    public MyraniumAxe() {
        super(ruby_tier, ruby_tier.getMaxUses(), -1, new Properties().group(ItemGroup.TOOLS).maxStackSize(1).addToolType(ToolType.AXE, ruby_tier.getHarvestLevel()).rarity(Rarity.RARE));
    }


}
