public class DoubleRoom extends Room {

    public DoubleRoom(int roomNumber) {
        super(roomNumber, 2000);
    }

    @Override
    public void displayDetails() {
        System.out.println("Double Room | Room No: " + getRoomNumber()
                + " | Price: " + getPrice()
                + " | Booked: " + isBooked());
    }
}