package codeclan.com.mariosprojectweek.Patronage;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Customer implements Patronal {
    private ArrayList<Sellable>order;
    private float funds;

    public Customer() {
        this.order = new ArrayList<>();
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

    public void addToOrder(Dish dish) {
        order.add(dish);
    }
}
