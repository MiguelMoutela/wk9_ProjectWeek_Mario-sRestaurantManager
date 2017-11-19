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
    public boolean checkTableIsVacant() {
        boolean tableIsVacant = false;
        int emptySeatCounter = 0;
        for(int index = 0; index < this.table.length; index++) {
            if (table[index] == null) {
                emptySeatCounter ++;
            }
        }if (emptySeatCounter == table.length) {
            tableIsVacant = true;
        }return tableIsVacant;
    }
    public void addToTable(Patronal patron) {
        for(int index = 0; index < this.table.length; index++) {
            if (table[index] == null) {
                table[index] = patron;
            }break;
        }
    }
    public void partyLeaves() {
        for(int index = 0; index < this.table.length-1; index++) {
            if (table[index] != null) {
                table[index] = null;
            }
        }
    }
}
