package codeclan.com.mariosprojectweek.Patronage;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Bar.BarStock;
import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Restaurant;
import codeclan.com.mariosprojectweek.Sellable;
import codeclan.com.mariosprojectweek.Storable;

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

    public void checkItemsAreInStock() {
        for (Storable fridge : Restaurant.stores) {


            for (Sellable item : order) {

                fridge.checkAmount(item.getListOfIngredients());


                //int amount = fridge.checkAmount(item.Name());




                //should I get the class of the item ie dish or barItem
                //need the loop to finish without returning
                //should remove the items from the menu(last step)
                if (checkItemsAreInStock(item.getName()) > 0) {
                    fridge.removeItemByName(item.getName());
                }
            }
        }
    }

    public void addToOrder(Sellable item) {
        order.add(item);
    }


}
