import java.io.*;
import java.util.*;

public class DataManager {

    private static final String FILE_NAME = "rooms.txt";

    public static void saveRooms(List<Room> rooms) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Room r : rooms) {
                writer.write(r.getRoomNumber() + "," +
                             r.getPrice() + "," +
                             r.isBooked());
                writer.newLine();
            }

            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static List<Room> loadRooms() throws BookingException {
        List<Room> rooms = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int roomNumber = Integer.parseInt(data[0]);
                double price = Double.parseDouble(data[1]);
                boolean isBooked = Boolean.parseBoolean(data[2]);

                Room room;

                if (price == 1000) {
                    room = new SingleRoom(roomNumber);
                } else {
                    room = new DoubleRoom(roomNumber);
                }

                if (isBooked) {
                    room.bookRoom();
                }

                rooms.add(room);
            }

        } catch (IOException e) {
            System.out.println("No previous data found. Starting fresh.");
        }

        return rooms;
    }
}