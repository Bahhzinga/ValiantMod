package net.bahzinga.valiant.setup.customitems.hoes;

import net.bahzinga.valiant.setup.ModItems;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class MyraniumHoe extends HoeItem {

    public static IItemTier hoe = new IItemTier() {
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
            return -492F;
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
            return Ingredient.fromItems(ModItems.MYRANIUM.get());
        }
    };

    public MyraniumHoe() {
        super(hoe, hoe.getMaxUses(), -1, new Item.Properties().group(ItemGroup.TOOLS).maxStackSize(1).addToolType(ToolType.HOE, hoe.getHarvestLevel()).rarity(Rarity.RARE));
    }
}
