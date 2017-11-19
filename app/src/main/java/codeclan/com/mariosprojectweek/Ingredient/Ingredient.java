package codeclan.com.mariosprojectweek.Ingredient;

/**
 * Created by user on 19/11/2017.
 */

public class Ingredient {
    private String name;
    private Enum<IngredientType>type;

    public Ingredient(String name, IngredientType type) {
        this.name = name.toLowerCase();
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Enum<IngredientType> getType() {
        return type;
    }
}
