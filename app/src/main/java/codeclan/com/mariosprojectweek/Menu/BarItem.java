package codeclan.com.mariosprojectweek.Menu;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class BarItem implements Sellable {
    ArrayList<Ingredient> ingredientList;
    private String name;
    private float price;

    public BarItem(String name, float price) {
        this.name = name.toLowerCase();
        this.price = price;
        this.ingredientList = new ArrayList<>();
    }

    public float getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getListOfIngredients() {
        ArrayList<String> ListOfIngredients = new ArrayList<String>();
        for (Ingredient ingredient : ingredientList) {
            ListOfIngredients.add(ingredient.getName());
        }
        return ListOfIngredients;
    }
}


