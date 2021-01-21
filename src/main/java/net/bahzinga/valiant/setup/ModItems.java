package net.bahzinga.valiant.setup;

import net.bahzinga.valiant.setup.customitems.axes.MagnesiumAxe;
import net.bahzinga.valiant.setup.customitems.axes.MyraniumAxe;
import net.bahzinga.valiant.setup.customitems.axes.RubyAxe;
import net.bahzinga.valiant.setup.customitems.fuels.UraniumItem;
import net.bahzinga.valiant.setup.customitems.hoes.*;
import net.bahzinga.valiant.setup.customitems.pickaxes.*;
import net.bahzinga.valiant.setup.customitems.shovels.*;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
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
    public static final RegistryObject<Item> MYRANIUM_AXE = Registration.ITEMS.register("myranium_axe", MyraniumAxe::new);
    public static final RegistryObject<Item> COBALT_AXE = Registration.ITEMS.register("cobalt_axe", RubyAxe::new);
    public static final RegistryObject<Item> SAPPHIRE_AXE = Registration.ITEMS.register("sapphire_axe", MyraniumAxe::new);
    public static final RegistryObject<Item> MAGNESIUM_AXE = Registration.ITEMS.register("magnesium_axe", MagnesiumAxe::new);

    public static final RegistryObject<Item> RUBY_SHOVEL = Registration.ITEMS.register("ruby_shovel", RubyShovel::new);
    public static final RegistryObject<Item> MYRANIUM_SHOVEL = Registration.ITEMS.register("myranium_shovel", MyraniumShovel::new);
    public static final RegistryObject<Item> COBALT_SHOVEL = Registration.ITEMS.register("cobalt_shovel", CobaltShovel::new);
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = Registration.ITEMS.register("sapphire_shovel", SapphireShovel::new);
    public static final RegistryObject<Item> MAGNESIUM_SHOVEL = Registration.ITEMS.register("magnesium_shovel", MagnesiumShovel::new);

    public static final RegistryObject<Item> RUBY_HOE = Registration.ITEMS.register("ruby_hoe", RubyHoe::new);
    public static final RegistryObject<Item> MYRANIUM_HOE = Registration.ITEMS.register("myranium_hoe", MyraniumHoe::new);
    public static final RegistryObject<Item> COBALT_HOE = Registration.ITEMS.register("cobalt_hoe", CobaltHoe::new);
    public static final RegistryObject<Item> SAPPHIRE_HOE = Registration.ITEMS.register("sapphire_hoe", SapphireHoe::new);
    public static final RegistryObject<Item> MAGNESIUM_HOE = Registration.ITEMS.register("magnesium_hoe", MagnesiumHoe::new);

    public static final RegistryObject<Item> CURED_FLESH = Registration.ITEMS.register("cured_flesh",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodInit.CURED_FLESH)));

    public static final RegistryObject<Item> SUSHI = Registration.ITEMS.register("sushi",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(FoodInit.SUSHI)));

}
