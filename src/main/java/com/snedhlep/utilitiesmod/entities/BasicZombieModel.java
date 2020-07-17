package com.snedhlep.utilitiesmod.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.monster.ZombieEntity;

public class BasicZombieModel extends EntityModel<BasicZombieEntity>
{
    public BipedModel<ZombieEntity> thing = new BipedModel<>(2.0f);

    @Override
    public void setRotationAngles(BasicZombieEntity basicZombieEntity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3)
    {
        thing.render(matrixStack, iVertexBuilder, i, i1, v, v1, v2, v3);
    }
}
