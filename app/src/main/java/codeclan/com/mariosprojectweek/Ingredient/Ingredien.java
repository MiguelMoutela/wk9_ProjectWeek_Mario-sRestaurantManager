package codeclan.com.mariosprojectweek.Ingredient;

/**
 * Created by user on 20/11/2017.
 */

public class Ingredien {
    private String name;
    private Integer quantity;

    public Ingredien(String name, Integer quantity) {
        this.name = name.toLowerCase();
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public void reduceQuantity(int amount) {
        if (amount < 0) {
            this.quantity -= amount;
        }
    }
    public boolean checkThereIsIngredient(String ingredient) {
        boolean thereIsIngredient = false;
        if (this.quantity != 0) {
            thereIsIngredient = true;
        }
        return thereIsIngredient;
    }
}
