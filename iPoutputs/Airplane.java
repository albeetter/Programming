package iPoutputs;

public class Airplane {
    private Seat[][] firstClass;
    private Seat[][] economyClass;

    public Airplane() {
        firstClass = new Seat[5][2];
        economyClass = new Seat[10][4];
        initializeSeats(firstClass);
        initializeSeats(economyClass);
    }

    private void initializeSeats(Seat[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                char column = (char) ('A' + j);
                seats[i][j] = new Seat(i + 1, column, (i + 1 <= 2) ? "W" : "A");
            }
        }
    }

    public String addPassengers(String classType, int numPassengers, String preference) {
        Seat[][] seats = (classType.equalsIgnoreCase("F")) ? firstClass : economyClass;
        StringBuilder assignedSeats = new StringBuilder("Assigned seats: ");

        int passengersAdded = 0;
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (passengersAdded < numPassengers && !seat.isAssigned() &&
                    (preference.equalsIgnoreCase(seat.getPreference()))) {
                    seat.assignPassenger();
                    assignedSeats.append(seat.getRow()).append(seat.getColumn()).append(" ");
                    passengersAdded++;
                }
            }
        }

        return assignedSeats.toString();
    }

    public String showSeating() {
        StringBuilder seatingInfo = new StringBuilder("First Class:\n");
        seatingInfo.append(printSeats(firstClass));
        seatingInfo.append("\nEconomy Class:\n");
        seatingInfo.append(printSeats(economyClass));
        return seatingInfo.toString();
    }

    private String printSeats(Seat[][] seats) {
        StringBuilder info = new StringBuilder();
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                if (seat.isAssigned()) {
                    info.append(seat.getRow()).append(seat.getColumn()).append(" Assigned\t");
                } else {
                    info.append(seat.getRow()).append(seat.getColumn()).append(" Available\t");
                }
            }
            info.append("\n");
        }
        return info.toString();
    }
}