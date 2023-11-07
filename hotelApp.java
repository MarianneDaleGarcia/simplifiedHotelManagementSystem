public class hotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.handleValetService("CAR001"); // queueing valet service for the vehicle with plate number "CAR001"
        frontDesk.handleHousekeepingService("321"); // queueing room cleaning for room number 321
        frontDesk.handleCartService(1); // queueing 1 luggage cart
    }
}