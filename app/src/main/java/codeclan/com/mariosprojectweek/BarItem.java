package codeclan.com.mariosprojectweek;

/**
 * Created by user on 19/11/2017.
 */

public class BarItem implements Sellable{
    private String name;
    private float price;

    public BarItem (String name){
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }
}
