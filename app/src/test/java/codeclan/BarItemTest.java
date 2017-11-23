package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Menu.BarItem;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/11/2017.
 */

public class BarItemTest {
    BarItem barItem;

    @Before
    public void before() {
        barItem = new BarItem("thatDrink", 5);
    }
    @Test
    public void canGetNameToLowerCase() {
        assertEquals("thatdrink", barItem.getName());
    }
    @Test
    public void canGetPrice() {
        assertEquals(5, barItem.getPrice(),0.01);
    }
}
