package buildcraft.oiltweak.blacklist;

import buildcraft.oiltweak.api.blacklist.ItemBlacklistProvider;
import buildcraft.oiltweak.api.blacklist.ItemBlacklistRegistry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

/**
 * @author Vexatos
 */
public class BlacklistRegistry implements ItemBlacklistRegistry {
	private final ArrayList<ItemBlacklistProvider> providers = new ArrayList<ItemBlacklistProvider>();

	@Override
	public void registerItemBlacklistProvider(ItemBlacklistProvider provider) {
		if(provider != null) {
			providers.add(provider);
		}
	}

	public boolean isBlacklisted(EntityLivingBase entity, ItemStack stack) {
		for(ItemBlacklistProvider provider : providers) {
			if(provider.isBlacklisted(entity, stack)) {
				return true;
			}
		}
		return false;
	}
}
