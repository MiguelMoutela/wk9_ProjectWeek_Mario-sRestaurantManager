package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronage.Customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by user on 19/11/2017.
 */

public class CustomerTest {
    Customer customer;
    Dish dish;
    BarItem barItem;
    @Before
    public void before() {
        customer = new Customer();
        dish = new Dish("a dish", 10);
        barItem = new BarItem("a drink", 1);
    }
    @Test
    public void canGetAndSetFunds() {
        customer.setFunds(100);
        assertEquals(100, customer.getFunds(), 0.01);
    }
    @Test
    public void canOrderAndGetBill() {
        customer.addToOrder(dish);
        assertEquals(10, customer.getBill(),0.01);
    }
}
