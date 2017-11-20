package codeclan.com.mariosprojectweek.Kitchen;

import java.util.HashMap;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;
import codeclan.com.mariosprojectweek.Storable;

/**
 * Created by user on 19/11/2017.
 */

public class KitchenStock implements Storable{
    HashMap<String,Integer> kitchenInventory = new HashMap<>();

    public int getSize() {
        return kitchenInventory.values().size();
    }

    public void addToStock(String name) {
        kitchenInventory.put(name,1);
    }

    public void addToStockByName(String name) {
        if (kitchenInventory.get(name) != null) {
            kitchenInventory.put(name, kitchenInventory.get(name) + 1);
        }
        else {
            kitchenInventory.put(name, 1);
        }
    }

    public int checkAmount(String name) {
        if (kitchenInventory.get(name) != null) {
            return kitchenInventory.get(name);
        }
        else {
            return 0;
        }
    }

    public void removeFromStockByName(String name) {
        if (checkAmount(name) > 0) {
            kitchenInventory.put(name, kitchenInventory.get(name) - 1);
        }
    }
}
