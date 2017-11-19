package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronage.Regular;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/11/2017.
 */

public class RegularTest {
    Regular regular;
    Dish dish;
    BarItem barItem;
    @Before
    public void before() {
        regular = new Regular();
        dish = new Dish("a dish", 10);
        barItem = new BarItem("a drink", 1);
    }
    @Test
    public void canGetAndSetFunds() {
        regular.setFunds(100);
        assertEquals(100, regular.getFunds(), 0.01);
    }
    @Test
    public void canOrderAndGetBill() {
        regular.addToOrder(dish);
        assertEquals(9, regular.getBill(),0.01);
    }
}
