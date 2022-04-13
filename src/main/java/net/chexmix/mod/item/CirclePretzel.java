package net.chexmix.mod.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CirclePretzel extends Item {
    public CirclePretzel() {
        super(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build()));
    }
}
