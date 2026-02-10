package buildcraft.oiltweak.integration.simplyjetpacks;

import buildcraft.BuildCraftEnergy;
import buildcraft.oiltweak.reference.Mods;
import cpw.mods.fml.common.Optional;

/**
 * @author Vexatos
 */
public class BuildCraftConfig {

    public boolean isOilDense() {
        return Mods.isBCEnergyLoaded && isOilDense_BC();
    }

    @Optional.Method(modid = Mods.BuildCraftEnergy)
    private boolean isOilDense_BC() {
        return BuildCraftEnergy.isOilDense;
    }
}
