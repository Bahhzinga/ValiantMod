package net.bahzinga.valiant.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static void register(){}

    // Ruby Ore
    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(3, 10)
            .sound(SoundType.STONE)));

    public static final RegistryObject<Block> MYRANIUM_ORE = register("myranium_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5, 13)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> MAGNESIUM_ORE = register("magnesium_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBALT_ORE = register("cobalt_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> URANIUM_ORE = register("uranium_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = register("sapphire_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = register("sapphire_block", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBALT_BLOCK = register("cobalt_block", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> PURIFIED_MYRANIUM = register("purified_myranium", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> UNREFINED_MYRANIUM = register("unrefined_myranium", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(3, 10)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> CORRUPT_LOG = register("corrupt_log", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(2, 5)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CORRUPT_LEAVES = register("corrupt_leaves", () ->
            new Block(AbstractBlock.Properties.create(Material.LEAVES)
                    .hardnessAndResistance(2, 5)
                    .sound(SoundType.VINE)));

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }

}
