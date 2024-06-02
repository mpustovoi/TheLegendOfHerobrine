package com.herobrinemod.herobrine.client.entities.renderers;

import com.herobrinemod.herobrine.HerobrineMod;
import com.herobrinemod.herobrine.client.entities.models.InfectedCowEntityModel;
import com.herobrinemod.herobrine.entities.InfectedMooshroomEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class InfectedMooshroomEyesFeatureRenderer extends EyesFeatureRenderer<InfectedMooshroomEntity, InfectedCowEntityModel<InfectedMooshroomEntity>> {
    public InfectedMooshroomEyesFeatureRenderer(FeatureRendererContext<InfectedMooshroomEntity, InfectedCowEntityModel<InfectedMooshroomEntity>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return RenderLayer.getEyes(Identifier.of(HerobrineMod.MODID, "textures/entity/eyes/infected_mooshroom.png"));
    }
}
