package net.bahzinga.valiant.data.client;

import net.bahzinga.valiant.Valiant;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Valiant.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("ruby_ore", modLoc("block/ruby_ore"));
        withExistingParent("ruby_block", modLoc("block/ruby_block"));
        withExistingParent("cobalt_ore", modLoc("block/cobalt_ore"));
        withExistingParent("cobalt_block", modLoc("block/cobalt_block"));
        withExistingParent("magnesium_ore", modLoc("block/magnesium_ore"));
        withExistingParent("myranium_ore", modLoc("block/myranium_ore"));
        withExistingParent("purified_myranium", modLoc("block/purified_myranium"));
        withExistingParent("unrefined_myranium", modLoc("block/unrefined_myranium"));
        withExistingParent("uranium_ore", modLoc("block/uranium_ore"));
        withExistingParent("sapphire_ore", modLoc("block/sapphire_ore"));
        withExistingParent("sapphire_block", modLoc("block/sapphire_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name){
        return getBuilder(name).parent(itemGenerated).texture("layer0", name);
    }
}
