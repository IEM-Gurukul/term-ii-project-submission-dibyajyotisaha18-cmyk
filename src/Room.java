public abstract class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() throws BookingException {
        if (isBooked) {
            throw new BookingException("Room already booked!");
        }
        isBooked = true;
    }

    public void cancelBooking() {
        if (!isBooked) {
            throw new RuntimeException("Room is not booked!");
        }
        isBooked = false;
    }

    public abstract void displayDetails();
}