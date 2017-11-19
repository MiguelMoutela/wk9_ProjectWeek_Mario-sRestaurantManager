package codeclan.com.mariosprojectweek.Kitchen;

import java.util.HashMap;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;

/**
 * Created by user on 19/11/2017.
 */

public class KitchenStock {
    HashMap<Ingredient,Integer> kitchenInventory = new HashMap<>();

    public int getSize() {
        return kitchenInventory.values().size();
    }

    public void addToStock(Ingredient ingredient) {
        kitchenInventory.put(ingredient,1);
    }
}
