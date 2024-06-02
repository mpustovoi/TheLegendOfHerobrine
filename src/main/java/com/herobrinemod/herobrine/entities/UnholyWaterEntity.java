package com.herobrinemod.herobrine.entities;

import com.herobrinemod.herobrine.items.ItemList;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class UnholyWaterEntity extends ThrownItemEntity {

    public UnholyWaterEntity(EntityType<? extends ThrownItemEntity> entityType, LivingEntity livingEntity, World world) {
        super(entityType, livingEntity, world);
    }

    public UnholyWaterEntity(World world) {
        super((EntityType<? extends ThrownItemEntity>) EntityTypeList.UNHOLY_WATER, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ItemList.UNHOLY_WATER;
    }

    @Override
    public void handleStatus(byte status) {
        if (status == 3) {
            for (int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(new ItemStackParticleEffect(ParticleTypes.ITEM, new ItemStack(getDefaultItem())), this.getX(), this.getY() + 0.1, this.getZ(), 0.0, 0.01, 0.0);
            }
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            Box effectBox = getBoundingBox().expand(1.0, 1.0, 1.0);
            List<LivingEntity> affectedEntities = this.getWorld().getEntitiesByClass(LivingEntity.class, effectBox, EntityPredicates.VALID_LIVING_ENTITY);
            if(!affectedEntities.isEmpty()) {
                for(LivingEntity entity : affectedEntities) {
                    if(entity.getType().isIn(EntityTypeTagList.IS_HEROBRINE) || entity.getType().isIn(EntityTypeTagList.IS_INFECTED_BY_HEROBRINE)) {
                        entity.heal(10.0f);
                    } else {
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300, 1));
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 1));
                        entity.setOnFireFor(15);
                        entity.damage(this.getDamageSources().thrown(this, getOwner()), 4.0f);
                    }
                }
            }
            this.playSound(SoundEvents.BLOCK_GLASS_BREAK, 0.8f, 0.9f / (random.nextFloat() * 0.4f + 0.8f));
            this.getWorld().sendEntityStatus(this, (byte) 3);
            this.remove(RemovalReason.DISCARDED);
        }
    }
}
