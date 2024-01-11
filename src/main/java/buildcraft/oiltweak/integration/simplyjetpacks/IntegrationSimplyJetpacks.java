package buildcraft.oiltweak.integration.simplyjetpacks;

import buildcraft.oiltweak.reference.Mods;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import tonius.simplyjetpacks.config.Config;

/**
 * @author Vexatos
 */
public class IntegrationSimplyJetpacks {

    private boolean actualFlammableFluidsExplode = false;

    public void init() {
        updateConfig();
    }

    public void deInit() {
        try {
            Config.flammableFluidsExplode = actualFlammableFluidsExplode;
        } catch (Exception e) {
            // NO-OP
        }
    }

    private void updateConfig() {
        try {
            actualFlammableFluidsExplode = Config.flammableFluidsExplode;
            Config.flammableFluidsExplode = true;
        } catch (Exception e) {
            // NO-OP
        }
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onConfigChanged(ConfigChangedEvent.PostConfigChangedEvent e) {
        if (e.modID.equals(Mods.SimplyJetpacks)) {
            updateConfig();
        }
    }
}
