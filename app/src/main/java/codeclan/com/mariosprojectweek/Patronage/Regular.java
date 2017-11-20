package codeclan.com.mariosprojectweek.Patronage;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Bar.BarStock;
import codeclan.com.mariosprojectweek.Kitchen.KitchenStock;
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
    private ArrayList<Dish>foodOrder;
    private ArrayList<BarItem>drinkOrder;
    private float funds;
    private float discount;

    public Regular() {
        this.funds = 0;
        this.foodOrder = new ArrayList<>();
        this.drinkOrder = new ArrayList<>();
        this.discount = 0.1f;
    }

    public float getBill() {
        float totalBill = 0;
        for (Dish item : foodOrder) {
            totalBill += (item.getPrice()*(1-this.discount)) ;
        }
        for (BarItem item : drinkOrder) {
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
        if (checkKitchenHasIngredients() = true) {
            foodOrder.add(item);
        }
        else return;
    }
    public void addToDrinkOrder(BarItem item) {
        if (checkBarHasItem() = false) {
            drinkOrder.add(item);
        }
        else return;
    }

    public boolean checkKitchenHasIngredients() {
        boolean KitchenHasIngredients = false;
        for (Dish item : foodOrder) {
            ArrayList<String>listOfIngredients = item.getListOfIngredients();
            for (String ingredient : listOfIngredients) {
                int howManyIngredientsKitchenHas = 0;
                if (KitchenStock.checkAmount(ingredient)) != 0) {
                    howManyIngredientsKitchenHas ++;
                }
            }
            if (howManyIngredientsKitchenHas == listOfIngredients.size()) {
                KitchenHasIngredients = true;
            }
            return checkKitchenHasIngredients();
        }
    }

    public boolean checkBarHasItem() {
        boolean barHasItem = false;
        for (BarItem item : drinkOrder) {
            if (BarStock.checkAmount(item.getName()) != 0) {
                barHasItem = true;
            }
        }
        return barHasItem;
    }
}
