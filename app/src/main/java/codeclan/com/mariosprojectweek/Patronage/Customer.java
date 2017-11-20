package codeclan.com.mariosprojectweek.Patronage;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Customer implements Patronal {
    private ArrayList<Dish>order;
    private ArrayList<BarItem>drinkOrder;
    private float funds;
    private float discount;

    public Customer() {
        this.order = new ArrayList<>();
        this.drinkOrder = new ArrayList<>();
        this.funds = funds;
    }

    public float getBill() {
        float totalBill = 0;
        for (Sellable item : order) {
            totalBill += item.getPrice();
        }
        return totalBill;
    }

    public float getFunds() {
        return funds;
    }

    public void setFunds(float funds) {
        this.funds = funds;
    }

    public void addToOrder(Dish item) {
        order.add(item);
    }

    public void addToDrinkOrder(BarItem item) {drinkOrder.add(item);}

    public void payBill(float bill) {
        this.funds -= bill;
    }
}
