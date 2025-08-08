package io.github.violetarray.catchyoulater;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatchYouLater implements ModInitializer {
	public static final String ID = "catch_you_later";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[Mod ID] It was the best of times, it was the worst of times; It was the age of wisdom, it was the age of foolishness;");
	}
}
