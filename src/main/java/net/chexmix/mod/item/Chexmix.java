package net.chexmix.mod.item;

import net.chexmix.mod.ChexmixMod;
import net.chexmix.mod.ItemInit;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class Chexmix extends Item {
    public Chexmix() {
        super(new Settings().maxCount(1).maxDamage(256));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (!world.isClient) {
            Random rand = ChexmixMod.rand;
            Item[] items = ItemInit.items;

            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.NEUTRAL, 0.5F, 1F);

            user.getInventory().insertStack(new ItemStack(items[rand.nextInt(6)]));

            user.getItemCooldownManager().set(this, 20);

            itemStack.damage(1, user, LivingEntity.getSlotForHand(hand));

            return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, itemStack);
        }

        return TypedActionResult.fail(itemStack);
    }
}
