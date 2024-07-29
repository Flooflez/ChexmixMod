package net.chexmix.mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class CornChex extends Item {
    public CornChex() {
        super(new Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(1.5f).snack().build()));
    }
}
