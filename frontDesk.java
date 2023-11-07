public class frontDesk {
    private HotelService valetService;
    private HotelService housekeepingService;
    private HotelService cartService;

    public frontDesk() {
        valetService = new Valet();
        housekeepingService = new Housekeeping();
        cartService = new Cart();
    }

    public void handleValetService(String plateNumber) {
        valetService.pickUpVehicle(plateNumber);
    }

    public void handleHousekeepingService(String roomNumber) {
        housekeepingService.cleanRoom(roomNumber);
    }

    public void handleCartService(int numberOfCarts) {
        cartService.requestCart(numberOfCarts);
    }
}