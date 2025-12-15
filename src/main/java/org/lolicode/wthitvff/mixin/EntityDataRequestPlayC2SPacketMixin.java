package org.lolicode.wthitvff.mixin;

import lol.bai.badpackets.api.play.ServerPlayContext;
import mcp.mobius.waila.network.play.c2s.EntityDataRequestPlayC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EntityDataRequestPlayC2SPacket.class, remap = false)
public class EntityDataRequestPlayC2SPacketMixin {
    @Inject(
            method = "lambda$common$0",
            at = @At("HEAD"),
            cancellable = true
    )
    private static void onHandlePayload(ServerPlayContext context, EntityDataRequestPlayC2SPacket.Payload payload, CallbackInfo ci) {
        java.util.UUID playerUUID = context.player().getUUID();
        if (org.lolicode.wthitvff.Wthitviafabricfix.blockedClients.getOrDefault(playerUUID, false)) {
            ci.cancel();
        }
    }
}
