package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Ingredient.Ingredient;
import codeclan.com.mariosprojectweek.Ingredient.IngredientType;

import static codeclan.com.mariosprojectweek.Ingredient.IngredientType.VEGAN;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/11/2017.
 */

public class IngredientTest {
    Ingredient ingredient;

    @Before
    public void before() {
        ingredient = new Ingredient("carrot", VEGAN);
    }
    @Test
    public void canGetName() {
        assertEquals("carrot", ingredient.getName());
    }
    @Test
    public void canGetType() {
        assertEquals(VEGAN, ingredient.getType());
    }
}
