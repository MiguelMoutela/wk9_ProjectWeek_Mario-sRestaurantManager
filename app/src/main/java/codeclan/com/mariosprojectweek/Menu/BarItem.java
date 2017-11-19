package codeclan.com.mariosprojectweek.Menu;

import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class BarItem implements Sellable {
    private String name;
    private float price;

    public BarItem (String name, float price){
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }
}
