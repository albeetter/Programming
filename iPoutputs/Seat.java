package iPoutputs;

public class Seat {
    private int row;
    private char column;
    private String preference;
    private boolean assigned;

    public Seat(int row, char column, String preference) {
        this.row = row;
        this.column = column;
        this.preference = preference;
        this.assigned = false;
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    public String getPreference() {
        return preference;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void assignPassenger() {
        this.assigned = true;
    }

    
    public String toString() {
        if (assigned) {
            return row + column + " Assigned";
        } else {
            return row + "" + column;
        }
    }
}