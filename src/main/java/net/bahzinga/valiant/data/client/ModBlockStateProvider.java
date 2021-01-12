package net.bahzinga.valiant.data.client;

import net.bahzinga.valiant.Valiant;
import net.bahzinga.valiant.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, Valiant.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels(){
        simpleBlock(ModBlocks.RUBY_ORE.get());
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
        simpleBlock(ModBlocks.MYRANIUM_ORE.get());
        simpleBlock(ModBlocks.MAGNESIUM_ORE.get());
        simpleBlock(ModBlocks.COBALT_ORE.get());
        simpleBlock(ModBlocks.COBALT_BLOCK.get());
        simpleBlock(ModBlocks.PURIFIED_MYRANIUM.get());
        simpleBlock(ModBlocks.UNREFINED_MYRANIUM.get());
        simpleBlock(ModBlocks.SAPPHIRE_BLOCK.get());
        simpleBlock(ModBlocks.SAPPHIRE_ORE.get());
        simpleBlock(ModBlocks.URANIUM_ORE.get());
        simpleBlock(ModBlocks.MYRANIUM_ORE.get());
    }
}
