package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Bar.BarItem;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/11/2017.
 */

public class BarItemTest {
    BarItem barItem;

    @Before
    public void before() {
        barItem = new BarItem("thatDrink");
    }
    @Test
    public void canGetName() {
        assertEquals("thatDrink", barItem.getName());
    }

}
