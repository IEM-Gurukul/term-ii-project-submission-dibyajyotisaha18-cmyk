
import java.util.*;

public class Hotel {

    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void viewRooms() {
        for (Room room : rooms) {
            room.displayDetails();
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void bookRoom(int roomNumber) throws BookingException {
        Room room = findRoom(roomNumber);
        if (room == null) {
            throw new RuntimeException("Invalid room number!");
        }
        room.bookRoom();
    }

    public void cancelBooking(int roomNumber) {
        Room room = findRoom(roomNumber);
        if (room == null) {
            throw new RuntimeException("Invalid room number!");
        }
        room.cancelBooking();
    }
}
