package airLine;

public class AirLine {
    private boolean[] seats;
    private final int firstClassTicketCategory = 1;

    public AirLine(){
        int numberOfSeats = 10;
        this.seats = new boolean[numberOfSeats];
    }
    public boolean[] getSeats() {
        return seats;
    }

    public void bookTicket(int bookingCategory){
        if (bookingCategory == firstClassTicketCategory){
            for (int counter = 0; counter < seats.length - 5; counter++){
                boolean isOccupiedSeat = seats[counter];
                if(!isOccupiedSeat){
                    seats[counter] = true;
                    break;
                }
            }
        }else {
            for (int counter = 0; counter < seats.length ; counter++) {
                boolean isOccupiedSeat = seats[counter];
                if(!isOccupiedSeat){
                    seats[counter] = true;
                    break;
                }
            }
        }
    }
}
