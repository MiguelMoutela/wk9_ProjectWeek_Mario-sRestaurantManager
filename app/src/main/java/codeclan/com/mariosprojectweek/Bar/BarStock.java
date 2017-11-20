package codeclan.com.mariosprojectweek.Bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import codeclan.com.mariosprojectweek.Menu.BarItem;

import static java.nio.file.Paths.get;


/**
 * Created by user on 19/11/2017.
 */

public class BarStock {
    HashMap<String, Integer> barInventory = new HashMap<>();

    public void addToStock(String name) {
        barInventory.put(name, 1);
    }

    public int getSize() {
        int size = barInventory.values().size();
        return size;
    }

    public void addToStockByName(String name) {
        if (barInventory.get(name) != null) {
            barInventory.put(name, barInventory.get(name) + 1);
        }
        else {
            barInventory.put(name, 1);
        }

    }
    public int checkAmount(String name) {
        if (barInventory.get(name) != null) {
            return barInventory.get(name);
        }
        else {
            return 0;
        }
    }
    public void removeFromStockByName(String name) {
        if (checkAmount(name) > 0) {
            barInventory.put(name, barInventory.get(name) - 1);
        }
    }

//    public void addToStockByName(String name) {
//        Set<String> stockList = getKeys();
//        for (String itemName : stockList) {
//            if (name.equals(itemName)) {
//                int barItemQuantity = barInventory.get(itemName);
//                barInventory.put(itemName, barItemQuantity + 1);
//            }
//            else {
//                barInventory.put(name, 1);
//            }
//        }
//    }

// apparently this should add 1 to value if it finds a key or just add the pair
//    public Set<String> getKeys() {
//       return barInventory.keySet();
//    }


}