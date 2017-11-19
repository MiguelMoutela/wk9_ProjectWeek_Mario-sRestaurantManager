package codeclan.com.mariosprojectweek.Bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import codeclan.com.mariosprojectweek.Menu.BarItem;


/**
 * Created by user on 19/11/2017.
 */

public class BarStock {
    HashMap<BarItem,Integer> barInventory = new HashMap<BarItem, Integer>();

    public void addToStock(BarItem barItem1) {
        barInventory.put(barItem1,1);
    }

    public Set<BarItem> getKeys() {
       return barInventory.keySet();
    }

    public int getSize() {
        int size = barInventory.values().size();
        return size;
    }

//    public void addToStockByName(BarItem barItem) {
//        Set<BarItem> drinkMenu = getKeys();
//        for (BarItem item : drinkMenu) {
//            if (barItem.getName().equals(item.getName())) {
//                ArrayList<BarItem> barInventory(barItem) + 1;
//            }
//        }
//    }
    public void AddToStockByName(BarItem BarItem) {
        barInventory.put(BarItem, barInventory.get(BarItem) +1);
    }
}
