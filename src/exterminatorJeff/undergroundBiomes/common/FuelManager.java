package exterminatorJeff.undergroundBiomes.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelManager implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.itemID == UndergroundBiomes.ligniteCoal.shiftedIndex){
			return 200;
		}else if(fuel.itemID == UndergroundBiomes.anthraciteCoalID){
			return 6400;
		}else{
			return 0;
		}
		
	}

}
