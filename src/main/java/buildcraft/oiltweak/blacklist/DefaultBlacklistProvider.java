package buildcraft.oiltweak.blacklist;

import buildcraft.oiltweak.api.blacklist.ItemBlacklistProvider;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;

/**
 * @author Vexatos
 */
public class DefaultBlacklistProvider implements ItemBlacklistProvider {
	@Override
	public boolean isBlacklisted(EntityLivingBase entity, ItemStack stack) {
		return stack.getItem() == Items.ender_pearl || stack.getItem() instanceof ItemEnderPearl;
	}
}
