package net.pigmanbruh.vineboom.item.custom;
// This class is used for Vineboom item right click functionality

import net.pigmanbruh.vineboom.sound.Sounds;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.sound.SoundCategory;

public class VineBoomItemFunction extends Item {
    public VineBoomItemFunction(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient) {
            user.playSound(Sounds.VINE_BOOM_SOUND_EVENT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            user.getItemCooldownManager().set(this, 5);
        }
        return super.use(world, user, hand);
    }
}
