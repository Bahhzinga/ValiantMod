package net.bahzinga.valiant.setup.customitems.pickaxes;

import net.bahzinga.valiant.setup.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class MagnesiumPickaxe extends PickaxeItem {

    public static IItemTier magnesium_tier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 400;
        }

        @Override
        public float getEfficiency() {
            return 5.5F;
        }

        @Override
        public float getAttackDamage() {
            return -396.5F;
        }

        @Override
        public int getHarvestLevel() {
            return 4; // 0: wood, 1: stone/gold, 2: iron, 3: diamond
        }

        @Override
        public int getEnchantability() {
            return 28;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ModItems.MAGNESIUM.get());
        }
    };

    public MagnesiumPickaxe() {
        super(magnesium_tier, magnesium_tier.getMaxUses(), -1, new Properties().group(ItemGroup.TOOLS).maxStackSize(1).addToolType(ToolType.PICKAXE, magnesium_tier.getHarvestLevel()).rarity(Rarity.RARE));
    }


}
