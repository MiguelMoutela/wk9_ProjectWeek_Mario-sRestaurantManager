package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Bar.BarStock;
import codeclan.com.mariosprojectweek.Menu.BarItem;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/11/2017.
 */

public class BarStockTest {
    BarStock barStock;
    BarItem barItem1;
    BarItem barItem2;

    @Before
    public void before() {
        barStock = new BarStock();
        barItem1 = new BarItem("thatDrink",5);
        barItem2 = new BarItem("thatDrink",5);
    }
    @Test
    public void canAddToStockAndGetSize() {
        String name = barItem1.getName();
        assertEquals(0, barStock.getSize());
        barStock.addToStock(name);
        assertEquals(1, barStock.getSize());

    }
    @Test
    public void canAddByName() {
        String name = barItem1.getName();
        String name2 = barItem2.getName();
        barStock.addToStockByName(name);
        assertEquals(1, barStock.getSize());
        barStock.addToStockByName(name2);
        assertEquals(1, barStock.getSize());
        assertEquals(2, barStock.checkAmount("thatdrink"));
    }
    @Test
    public void canRemoveByName() {
        //add by name
        String name = barItem1.getName();
        String name2 = barItem2.getName();
        barStock.addToStockByName(name);
        assertEquals(1, barStock.getSize());
        barStock.addToStockByName(name2);
        assertEquals(1, barStock.getSize());
        assertEquals(2, barStock.checkAmount("thatdrink"));
        //remove by name
        barStock.removeFromStockByName(name);
        assertEquals(1, barStock.checkAmount("thatdrink"));
        barStock.removeFromStockByName(name);
        assertEquals(0, barStock.checkAmount("thatdrink"));
        barStock.removeFromStockByName(name);
        assertEquals(0, barStock.checkAmount("thatdrink"));
    }
}
