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
        barStock.addToStock(barItem1);
        assertEquals(1, barStock.getSize());
    }
    @Test
    public void canAddByName() {
        barStock.addToStock(barItem1);
        barStock.addToStockByName(barItem2);
        assertEquals(1, barStock.getSize());
    }
}
