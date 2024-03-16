package buildcraft.oiltweak;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

/**
 * @author Vexatos
 */
public class OilTweakProperties implements IExtendedEntityProperties {

    public float realStepHeight;
    public boolean inOil;

    @Override
    public void saveNBTData(NBTTagCompound data) {
        data.setBoolean("oiltweak.inOil", inOil);
        if (inOil) {
            data.setFloat("oiltweak:stepHeight", realStepHeight);
        }
    }

    @Override
    public void loadNBTData(NBTTagCompound data) {
        if (data.hasKey("oiltweak.inOil")) {
            inOil = data.getBoolean("oiltweak.inOil");
        }
        if (inOil && data.hasKey("oiltweak:stepHeight")) {
            realStepHeight = data.getFloat("oiltweak:stepHeight");
        }
    }

    @Override
    public void init(Entity entity, World world) {
        this.inOil = false;
        this.realStepHeight = entity.stepHeight;
    }
}
