package buildcraft.oiltweak.reference;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModAPIManager;

/**
 * @author Vexatos
 */
public class Mods {
	//The mod itself
	public static final String
		BCOilTweak = "OilTweak",
		BCOilTweak_NAME = "BuildCraft Oil Tweak";

	//Other mods
	public static final String
		BuildCraftCore = "BuildCraft|Core",
		BuildCraftEnergy = "BuildCraft|Energy",
		SimplyJetpacks = "simplyjetpacks";

	public static boolean hasAPI(String name) {
		return ModAPIManager.INSTANCE.hasAPI(name);
	}

	public static boolean isLoaded(String name) {
		return Loader.isModLoaded(name);
	}
}
