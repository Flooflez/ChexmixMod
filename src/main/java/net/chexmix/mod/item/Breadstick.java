package net.chexmix.mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class Breadstick extends Item {
    public Breadstick() {
        super(new Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(0.9f).snack().build()));
    }
}
