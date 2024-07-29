package net.chexmix.mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class RyeCracker extends Item {
    public RyeCracker() {
        super(new Settings().food(new FoodComponent.Builder().nutrition(3).saturationModifier(2f).snack().build()));
    }
}
