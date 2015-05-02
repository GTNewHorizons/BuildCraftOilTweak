package buildcraft.oiltweak;

import buildcraft.oiltweak.integration.simplyjetpacks.IntegrationSimplyJetpacks;
import buildcraft.oiltweak.reference.Mods;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLModDisabledEvent;
import net.minecraftforge.common.MinecraftForge;

/**
 * @author Vexatos
 */
@Mod(modid = Mods.BCOilTweak, name = Mods.BCOilTweak_NAME, version = "@VERSION@", canBeDeactivated = true,
	dependencies = "required-after:BuildCraft|Core@[6.4.1,);required-after:Forge@[10.13.2.1236,);"
		+ "required-after:BuildCraft|Energy@[6.4.1,);after:EnderIO@[1.7.10_2.2.7,);after:simplyjetpacks")
public class BuildCraftOilTweak {

	@Instance(Mods.BCOilTweak)
	public static BuildCraftOilTweak instance;
	private static OilTweakEventHandler eventHandler;
	private static IntegrationSimplyJetpacks simplyJetpacks;

	@EventHandler
	public void init(FMLInitializationEvent event) {
		eventHandler = new OilTweakEventHandler();
		FMLCommonHandler.instance().bus().register(eventHandler);
		MinecraftForge.EVENT_BUS.register(eventHandler);
		if(Mods.isLoaded(Mods.SimplyJetpacks)) {
			simplyJetpacks = new IntegrationSimplyJetpacks();
			FMLCommonHandler.instance().bus().register(simplyJetpacks);
			simplyJetpacks.init();
		}
	}

	@EventHandler
	public void deInit(FMLModDisabledEvent event) {
		if(eventHandler != null) {
			FMLCommonHandler.instance().bus().unregister(eventHandler);
			MinecraftForge.EVENT_BUS.unregister(eventHandler);
		}
		if(Mods.isLoaded(Mods.SimplyJetpacks) && simplyJetpacks != null) {
			simplyJetpacks.deInit();
		}
	}
}
