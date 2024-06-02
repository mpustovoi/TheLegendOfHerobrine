package com.herobrinemod.herobrine.client.entities.renderers;

import com.herobrinemod.herobrine.HerobrineMod;
import com.herobrinemod.herobrine.client.entities.models.InfectedCowEntityModel;
import com.herobrinemod.herobrine.entities.InfectedCowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class InfectedCowEyesFeatureRenderer extends EyesFeatureRenderer<InfectedCowEntity, InfectedCowEntityModel<InfectedCowEntity>> {
    public InfectedCowEyesFeatureRenderer(FeatureRendererContext<InfectedCowEntity, InfectedCowEntityModel<InfectedCowEntity>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return RenderLayer.getEyes(Identifier.of(HerobrineMod.MODID, "textures/entity/eyes/infected_cow.png"));
    }
}
