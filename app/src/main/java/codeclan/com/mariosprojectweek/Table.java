package codeclan.com.mariosprojectweek;

/**
 * Created by user on 19/11/2017.
 */

public class Table {
    private Patronal[] table;

    public Table() {
        this.table = new Patronal[2];
    }

    public float getTableTotal() {
        float tableTotal = 0;
        for (Patronal person : table) {
            tableTotal += person.getBill();
        }
        return tableTotal;
    }
    public void addToTable(Patronal patron) {
        for(int index = 0; index < this.table.length-1; index++) {
            if (table[index] == null) {
                table[index] = patron;
            }
        }
    }
    public void removeFromTable() {
        for(int index = 0; index < this.table.length-1; index++) {
            if (table[index] != null) {
                table[index] = null;
            }
        }
    }
}
