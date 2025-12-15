package org.lolicode.wthitvff;

import net.fabricmc.api.ModInitializer;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Wthitviafabricfix implements ModInitializer {
	public static final ConcurrentHashMap<UUID, Boolean> blockedClients = new ConcurrentHashMap<>();

	@Override
	public void onInitialize() {
	}
}