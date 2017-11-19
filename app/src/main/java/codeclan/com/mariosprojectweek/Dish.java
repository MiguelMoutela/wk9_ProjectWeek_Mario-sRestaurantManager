package codeclan.com.mariosprojectweek;

import java.util.HashMap;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;

/**
 * Created by user on 19/11/2017.
 */

public class Dish implements Sellable{
    HashMap<Ingredient, Integer>ingredientList= new HashMap<Ingredient,Integer>();
    float price;

    public float getPrice() {
        return this.price;
    }
}
