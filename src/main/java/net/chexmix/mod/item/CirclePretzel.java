package net.chexmix.mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class CirclePretzel extends Item {
    public CirclePretzel() {
        super(new Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f).snack().build()));
    }
}
