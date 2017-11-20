package codeclan.com.mariosprojectweek.Bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Storable;

import static java.nio.file.Paths.get;


/**
 * Created by user on 19/11/2017.
 */

public class BarStock implements Storable{
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
}