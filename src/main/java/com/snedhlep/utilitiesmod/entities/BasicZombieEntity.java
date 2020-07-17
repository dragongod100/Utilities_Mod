package com.snedhlep.utilitiesmod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class BasicZombieEntity extends ZombieEntity
{

    public BasicZombieEntity(EntityType<BasicZombieEntity> thing, World world)
    {
        super(thing, world);
    }

    @Override
    protected boolean shouldDrown()
    {
        return false;
    }
}
