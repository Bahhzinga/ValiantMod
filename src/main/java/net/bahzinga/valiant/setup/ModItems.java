package net.bahzinga.valiant.setup;

import net.bahzinga.valiant.setup.customitems.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    static void register() {}


    public static final RegistryObject<Item> RUBY = Registration.ITEMS.register("ruby", () -> new Item((new Item.Properties()).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MAGNESIUM = Registration.ITEMS.register("magnesium", () -> new Item((new Item.Properties()).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> COBALT = Registration.ITEMS.register("cobalt", () -> new Item((new Item.Properties()).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> SAPPHIRE = Registration.ITEMS.register("sapphire", () -> new Item((new Item.Properties()).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> URANIUM = Registration.ITEMS.register("uranium",
            () -> new UraniumItem(new Item.Properties().group(ItemGroup.MISC).maxStackSize(16)));

    public static final RegistryObject<Item> MYRANIUM = Registration.ITEMS.register("myranium", () -> new Item((new Item.Properties()).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> RUBY_PICKAXE = Registration.ITEMS.register("ruby_pickaxe", RubyPickaxe::new);
    public static final RegistryObject<Item> MYRANIUM_PICKAXE = Registration.ITEMS.register("myranium_pickaxe", MyraniumPickaxe::new);
    public static final RegistryObject<Item> MAGNESIUM_PICKAXE = Registration.ITEMS.register("magnesium_pickaxe", MagnesiumPickaxe::new);
    public static final RegistryObject<Item> COBALT_PICKAXE = Registration.ITEMS.register("cobalt_pickaxe", CobaltPickaxe::new);
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = Registration.ITEMS.register("sapphire_pickaxe", SapphirePickaxe::new);

    public static final RegistryObject<Item> RUBY_AXE = Registration.ITEMS.register("ruby_axe", RubyAxe::new);



}
