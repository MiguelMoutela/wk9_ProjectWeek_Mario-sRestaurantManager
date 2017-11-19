package codeclan.com.mariosprojectweek.Bar;

import java.util.HashMap;

import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Menu.Menu.BarItem;

/**
 * Created by user on 19/11/2017.
 */

public class BarStock {
    HashMap<BarItem,Integer> barInventory = new HashMap<BarItem, Integer>();

    public void addToStock(BarItem barItem1) {
        barInventory.put(barItem1,1);
    }

    public int getSize() {
        int size = barInventory.values().size();
        return size;
    }
}
