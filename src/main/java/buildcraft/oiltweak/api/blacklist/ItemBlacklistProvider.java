package buildcraft.oiltweak.api.blacklist;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * @author Vexatos
 */
public interface ItemBlacklistProvider {
	boolean isBlacklisted(EntityLivingBase entity, ItemStack stack);
}
