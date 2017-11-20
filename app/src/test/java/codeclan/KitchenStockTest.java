package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;
import codeclan.com.mariosprojectweek.Ingredient.IngredientType;
import codeclan.com.mariosprojectweek.Kitchen.KitchenStock;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/11/2017.
 */

public class KitchenStockTest {
    KitchenStock kitchenStock;
    Ingredient ingredient1;
    Ingredient ingredient2;

    @Before
    public void before() {
        kitchenStock = new KitchenStock();
        ingredient1 = new Ingredient("potato", IngredientType.VEGETARIAN);
        ingredient2 = new Ingredient("cream sauce", IngredientType.VEGAN);
    }
    @Test
    public void canAddToStockAndGetSize() {
        assertEquals(0, kitchenStock.getSize());
        kitchenStock.addToStock(ingredient1);
        assertEquals(1, kitchenStock.getSize());
    }

}
