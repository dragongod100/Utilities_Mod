package com.snedhlep.utilitiesmod.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.snedhlep.utilitiesmod.UtilitiesMod;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

public class BasicZombieRenderer extends MobRenderer<BasicZombieEntity, BasicZombieModel>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(UtilitiesMod.MODID, "textures/entity/my_zombie.png");

    protected BasicZombieRenderer(EntityRendererManager p_i46179_1_)
    {
        super(p_i46179_1_, new BasicZombieModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(BasicZombieEntity entity)
    {
        return TEXTURE;
    }
}
