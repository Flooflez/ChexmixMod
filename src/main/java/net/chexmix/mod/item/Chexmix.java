package net.chexmix.mod.item;

import net.chexmix.mod.ChexmixMod;
import net.chexmix.mod.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class Chexmix extends Item {
    public Chexmix() {
        super(new Item.Settings().maxCount(1).maxDamage(256));
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (!world.isClient) {
            Random rand = ChexmixMod.rand;
            Item[] items = ItemInit.items;

            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.NEUTRAL, 0.5F, 1F);

            user.getInventory().insertStack(new ItemStack(items[rand.nextInt(6)]));

            user.getItemCooldownManager().set(itemStack, 20);

            itemStack.damage(1, user, LivingEntity.getSlotForHand(hand));

            return ActionResult.SUCCESS;
        }

        return ActionResult.FAIL;
    }
}
