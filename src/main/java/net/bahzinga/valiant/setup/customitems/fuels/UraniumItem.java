package net.bahzinga.valiant.setup.customitems.fuels;

import net.bahzinga.valiant.Valiant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

import java.util.Properties;
;
public class UraniumItem extends Item {

    public UraniumItem(Properties properties){
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 400;
    }

}
