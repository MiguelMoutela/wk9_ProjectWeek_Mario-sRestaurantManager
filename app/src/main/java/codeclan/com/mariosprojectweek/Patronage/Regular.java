package codeclan.com.mariosprojectweek.Patronage;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Regular implements Patronal {
    private ArrayList<Sellable>order;
    private float funds;

    public Regular(ArrayList order) {
        this.order = new ArrayList<>();
    }

    public float getBill() {
        float totalBill = 0;
        for (Sellable item : order) {
            totalBill += item.getPrice();
        }
        return totalBill;
    }
}
