package codeclan.com.mariosprojectweek;

import java.util.ArrayList;

import codeclan.com.mariosprojectweek.Menu.Menu;

/**
 * Created by user on 19/11/2017.
 */

public class Restaurant {
    private String name;
    private float turnover;
    private Table[] tables;
    private Menu menu;
    private ArrayList<Storable>stores;


    public Restaurant () {
        this.name = name;
        this.turnover = turnover;
        this.tables = new Table[5];
        this.menu = menu;
        this.stores = new ArrayList();
    }
}
