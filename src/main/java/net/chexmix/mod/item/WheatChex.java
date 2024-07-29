package net.chexmix.mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;


public class WheatChex extends Item {
    public WheatChex() {
        super(new Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(1.5f).snack().build()));
    }
}
