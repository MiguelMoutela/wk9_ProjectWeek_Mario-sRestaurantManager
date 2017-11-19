package codeclan.com.mariosprojectweek.Patron;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Customer implements Patronal {
    private ArrayList<Sellable>order;

    public Customer(ArrayList Order) {
        this.order = new ArrayList<>();
    }

    public float getBill() {
        return null;
    }

}
