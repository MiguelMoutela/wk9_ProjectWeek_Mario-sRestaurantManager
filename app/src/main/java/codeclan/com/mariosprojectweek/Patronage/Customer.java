package codeclan.com.mariosprojectweek.Patronage;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Bar.BarStock;
import codeclan.com.mariosprojectweek.Kitchen.KitchenStock;
import codeclan.com.mariosprojectweek.Menu.BarItem;
import codeclan.com.mariosprojectweek.Menu.Dish;
import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Customer implements Patronal {
    private ArrayList<Dish>foodOrder;
    private ArrayList<BarItem>drinkOrder;
    private float funds;

    public Customer() {
        this.foodOrder = new ArrayList<>();
        this.drinkOrder = new ArrayList<>();
        this.funds = funds;
    }

    public float getBill() {
        float totalBill = 0;
        for (Dish item : foodOrder) {
            totalBill += (item.getPrice()) ;
        }
        for (BarItem item : drinkOrder) {
            totalBill += (item.getPrice()) ;
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

    public void payBill(float bill) {
        this.funds -= bill;
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
