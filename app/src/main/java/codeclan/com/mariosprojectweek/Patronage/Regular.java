package codeclan.com.mariosprojectweek.Patronage;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Bar.BarStock;
import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Regular implements Patronal {
    private ArrayList<Sellable>order;
    private float funds;

    public Regular() {
        this.funds = funds;
        this.order = new ArrayList<>();
    }

    public float getBill() {
        float totalBill = 0;
        for (Sellable item : order) {
            totalBill += (item.getPrice()*0.9) ;
        }
        return totalBill;
    }

    public void setFunds(float funds) {
        this.funds = funds;
    }

    public float getFunds() {
        return funds;
    }

    public void payBill(float bill) {
        this.funds -= bill;
    }

    public void checkIngredientsAreInStock() {
        for (Sellable item : order) {

        }
    }

    public void addToOrder(Sellable item) {
        order.add(item);
    }


}
