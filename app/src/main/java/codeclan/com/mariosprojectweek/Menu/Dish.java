package codeclan.com.mariosprojectweek.Menu;

import java.util.ArrayList;
import java.util.HashMap;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Dish implements Sellable {
    ArrayList<Ingredient>ingredientList= new ArrayList<>();
    String name;
    float price;

    public Dish(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return this.name; }

    public float getPrice() {
        return this.price;
    }
}
