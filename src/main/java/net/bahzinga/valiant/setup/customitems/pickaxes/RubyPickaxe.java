package net.bahzinga.valiant.setup.customitems.pickaxes;

import net.bahzinga.valiant.Valiant;
import net.bahzinga.valiant.setup.ModItems;
import net.bahzinga.valiant.setup.Registration;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class RubyPickaxe extends PickaxeItem {

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
            return -495.0F;
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

    public RubyPickaxe() {
        super(ruby_tier, ruby_tier.getMaxUses(), -1, new Properties().group(ItemGroup.TOOLS).maxStackSize(1).addToolType(ToolType.PICKAXE, ruby_tier.getHarvestLevel()).rarity(Rarity.RARE));
    }


}
