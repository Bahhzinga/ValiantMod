package net.bahzinga.valiant.setup.customitems.pickaxes;

import net.bahzinga.valiant.setup.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class SapphirePickaxe extends PickaxeItem {

    public static IItemTier sapphire_tier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 335;
        }

        @Override
        public float getEfficiency() {
            return 5.5F;
        }

        @Override
        public float getAttackDamage() {
            return -332F;
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
            return Ingredient.fromItems(ModItems.SAPPHIRE.get());
        }
    };

    public SapphirePickaxe() {
        super(sapphire_tier, sapphire_tier.getMaxUses(), -1, new Properties().group(ItemGroup.TOOLS).maxStackSize(1).addToolType(ToolType.PICKAXE, sapphire_tier.getHarvestLevel()).rarity(Rarity.RARE));
    }


}
