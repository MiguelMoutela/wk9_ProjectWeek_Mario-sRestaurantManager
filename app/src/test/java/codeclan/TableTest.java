package codeclan;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronage.Customer;
import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Table;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/11/2017.
 */

public class TableTest {
    Table table;
    Customer customer;
    Dish dish;
    @Before
    public void before() {
        table = new Table();
        customer = new Customer();
        dish = new Dish("a dish", 10);
    }
    @Test
    public void canAddPatron() {
        assertEquals(true, table.checkTableIsVacant());
        table.addToTable(customer);
        table.addToTable(customer);
        assertEquals(false, table.checkTableIsVacant());
    }
    @Test
    public void canRemovePatron() {
        assertEquals(true, table.checkTableIsVacant());
        table.addToTable(customer);
        table.partyLeaves();
        assertEquals(true, table.checkTableIsVacant());
    }
    @Test
    public void canGetBill() {
        assertEquals(true, table.checkTableIsVacant());
        customer.addToOrder(dish);
        assertEquals(10,customer.getBill(),0.01);
        table.addToTable(customer);
        assertEquals(10, table.getTableTotal(),0.01);
    }


}
