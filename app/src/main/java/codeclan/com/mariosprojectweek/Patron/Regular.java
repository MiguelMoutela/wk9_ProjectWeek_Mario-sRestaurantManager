package codeclan.com.mariosprojectweek.Patron;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Patronal;
import codeclan.com.mariosprojectweek.Sellable;

/**
 * Created by user on 19/11/2017.
 */

public class Regular implements Patronal {
    private ArrayList<Sellable>order;

    public Regular(ArrayList order) {
        this.order = new ArrayList<>();
    }

    public float getBill(){}
}
