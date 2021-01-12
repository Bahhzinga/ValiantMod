package net.bahzinga.valiant.setup.customitems;

import net.bahzinga.valiant.setup.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class MyraniumPickaxe extends PickaxeItem {

    public static IItemTier myranium_tier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 500;
        }

        @Override
        public float getEfficiency() {
            return 5.5F;
        }

        @Override
        public float getAttackDamage() {
            return -494.5F;
        }

        @Override
        public int getHarvestLevel() {
            return 4; // 0: wood, 1: stone/gold, 2: iron, 3: diamond
        }

        @Override
        public int getEnchantability() {
            return 31;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ModItems.MYRANIUM.get());
        }
    };

    public MyraniumPickaxe() {
        super(myranium_tier, myranium_tier.getMaxUses(), -1, new Properties().group(ItemGroup.TOOLS).maxStackSize(1).addToolType(ToolType.PICKAXE, myranium_tier.getHarvestLevel()).rarity(Rarity.RARE));
    }


}
