package buildcraft.oiltweak.blacklist;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;

import buildcraft.oiltweak.api.blacklist.ItemBlacklistProvider;

/**
 * @author Vexatos
 */
public class DefaultBlacklistProvider implements ItemBlacklistProvider {

    @Override
    public boolean isBlacklisted(EntityLivingBase entity, ItemStack stack) {
        return stack != null && (stack.getItem() == Items.ender_pearl || stack.getItem() instanceof ItemEnderPearl);
    }
}
