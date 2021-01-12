package net.bahzinga.valiant.setup.customitems;

import net.bahzinga.valiant.setup.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class CobaltPickaxe extends PickaxeItem {

    public static IItemTier cobalt_tier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 375;
        }

        @Override
        public float getEfficiency() {
            return 5.5F;
        }

        @Override
        public float getAttackDamage() {
            return -372F;
        }

        @Override
        public int getHarvestLevel() {
            return 2; // 0: wood, 1: stone/gold, 2: iron, 3: diamond
        }

        @Override
        public int getEnchantability() {
            return 23;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ModItems.COBALT.get());
        }
    };

    public CobaltPickaxe() {
        super(cobalt_tier, cobalt_tier.getMaxUses(), -1, new Properties().group(ItemGroup.TOOLS).maxStackSize(1).addToolType(ToolType.PICKAXE, cobalt_tier.getHarvestLevel()).rarity(Rarity.RARE));
    }


}
