package net.chexmix.mod.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RyeCracker extends Item {
    public RyeCracker() {
        super(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(2f).snack().build()));
    }
}
