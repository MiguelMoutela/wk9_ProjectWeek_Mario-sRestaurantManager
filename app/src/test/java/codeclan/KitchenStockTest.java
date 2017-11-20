package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;
import codeclan.com.mariosprojectweek.Ingredient.IngredientType;
import codeclan.com.mariosprojectweek.Kitchen.KitchenStock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        ingredient2 = new Ingredient("cream", IngredientType.VEGAN);
    }
    @Test
    public void canAddToStockAndGetSize() {
        assertEquals(0, kitchenStock.getSize());
        String name = ingredient1.getName();
        kitchenStock.addToStock(name);
        assertEquals(1, kitchenStock.getSize());
    }
    @Test
    public void canAddToStockByName() {
        assertEquals(0,kitchenStock.getSize());
        String name1 = ingredient1.getName();
        kitchenStock.addToStockByName(name1);
        assertEquals(1, kitchenStock.getSize());
        assertEquals(1, kitchenStock.checkAmount(name1));
        String name2 = ingredient2.getName();
        assertEquals(0, kitchenStock.checkAmount(name2));
        kitchenStock.addToStockByName(name2);
        assertEquals(2, kitchenStock.getSize());
        assertEquals(1, kitchenStock.checkAmount(name2));
    }
    @Test
    public void canRemoveFromStockByName() {
        //adding to stock
        assertEquals(0,kitchenStock.getSize());
        String name1 = ingredient1.getName();
        kitchenStock.addToStockByName(name1);
        assertEquals(1, kitchenStock.getSize());
        assertEquals(1, kitchenStock.checkAmount(name1));
        String name2 = ingredient2.getName();
        assertEquals(0, kitchenStock.checkAmount(name2));
        kitchenStock.addToStockByName(name2);
        assertEquals(2, kitchenStock.getSize());
        assertEquals(1, kitchenStock.checkAmount(name2));
        //now removing
        kitchenStock.removeFromStockByName(name1);
        assertEquals(0, kitchenStock.checkAmount(name1));
        assertEquals(2, kitchenStock.getSize());
    }
}
