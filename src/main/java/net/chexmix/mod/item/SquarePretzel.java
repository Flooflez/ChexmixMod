package net.chexmix.mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class SquarePretzel extends Item {
    public SquarePretzel() {
        super(new Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.6f).snack().build()));
    }
}
