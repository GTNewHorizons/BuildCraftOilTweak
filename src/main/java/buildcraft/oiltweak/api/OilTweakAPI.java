package buildcraft.oiltweak.api;

import buildcraft.oiltweak.api.blacklist.ItemBlacklistRegistry;

/**
 * @author Vexatos
 */
public abstract class OilTweakAPI {

    public static OilTweakAPI INSTANCE;

    public abstract ItemBlacklistRegistry getItemBlacklistRegistry();
}
