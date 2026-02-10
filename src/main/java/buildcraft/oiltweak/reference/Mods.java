package buildcraft.oiltweak.reference;

import cpw.mods.fml.common.Loader;

/**
 * @author Vexatos
 */
public class Mods {

    // The mod itself
    public static final String BCOilTweak = "OilTweak";
    public static final String BCOilTweak_NAME = "BuildCraft Oil Tweak";

    public static final String BuildCraftEnergy = "BuildCraft|Energy";
    public static final String SimplyJetpacks = "simplyjetpacks";

    public static final boolean isBCEnergyLoaded = Loader.isModLoaded(BuildCraftEnergy);
    public static final boolean isSimplyJetpacksLoaded = Loader.isModLoaded(SimplyJetpacks);
}
