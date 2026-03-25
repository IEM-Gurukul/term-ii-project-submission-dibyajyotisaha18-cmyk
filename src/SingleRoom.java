public class SingleRoom extends Room {

    public SingleRoom(int roomNumber) {
        super(roomNumber, 1000);
    }

    @Override
    public void displayDetails() {
        System.out.println("Single Room | Room No: " + getRoomNumber()
                + " | Price: " + getPrice()
                + " | Booked: " + isBooked());
    }
}