package net.chexmix.mod;

import net.chexmix.mod.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {

    public static final Item CIRCLE_PRETZEL = new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f).snack().build()));
    public static final Item CORN_CHEX = new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(1.5f).snack().build()));
    public static final Item BREADSTICK = new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.9f).snack().build()));
    public static final Item RYE_CRACKER = new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(1.75f).snack().build()));
    public static final Item SQUARE_PRETZEL = new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6f).snack().build()));
    public static final Item WHEAT_CHEX = new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(1.5f).snack().build()));

    public static final Chexmix CHEXMIX = new Chexmix();
;
    public static final Item[] items = new Item[]{WHEAT_CHEX, CIRCLE_PRETZEL, CORN_CHEX, BREADSTICK, RYE_CRACKER, SQUARE_PRETZEL};

    public static void init(){
        RegisterFood("circle_pretzel", CIRCLE_PRETZEL);
        RegisterFood("corn_chex", CORN_CHEX);
        RegisterFood("breadstick", BREADSTICK);
        RegisterFood("rye_cracker", RYE_CRACKER);
        RegisterFood("square_pretzel", SQUARE_PRETZEL);
        RegisterFood("wheat_chex", WHEAT_CHEX);

        RegisterFood("chexmix", CHEXMIX);
    }

    private static void RegisterFood(String id, Item item){
        Registry.register(Registries.ITEM, Identifier.of(ChexmixMod.MODID, id), item);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.add(item));
    }

}
