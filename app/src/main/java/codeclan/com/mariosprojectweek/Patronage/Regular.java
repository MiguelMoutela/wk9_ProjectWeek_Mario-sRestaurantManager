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
    private ArrayList<Dish>order;
    private ArrayList<BarItem>drinkOrder;
    private float funds;
    private float discount;

    public Regular() {
        this.funds = 0;
        this.order = new ArrayList<>();
        this.drinkOrder = new ArrayList<>();
        this.discount = 0.1f;
    }

    public float getBill() {
        float totalBill = 0;
        for (Sellable item : order) {
            totalBill += (item.getPrice()*(1-this.discount)) ;
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

    public void addToOrder(Dish item) {
        order.add(item);
    }

    public void addToDrinkOrder(BarItem item) {drinkOrder.add(item);}

    public void checkItemsAreInStock() {



            for (Sellable item : order) {
                ArrayList<String>listOfIngredients = item.getListOfIngredients();
                for (String ingredient : listOfIngredients)
                    for (Storable fridge : Restaurant.stores) {
                        if (fridge.checkAmount(ingredient) == 0) {
                            //remove item from order
                            //remove item from menu
                        }


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



}
