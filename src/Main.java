
import java.util.*;

public class Main {

    public static void main(String[] args) throws BookingException {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        List<Room> loadedRooms = DataManager.loadRooms();

        if (loadedRooms.isEmpty()) {
            hotel.addRoom(new SingleRoom(101));
            hotel.addRoom(new SingleRoom(102));
            hotel.addRoom(new DoubleRoom(201));
            hotel.addRoom(new DoubleRoom(202));
        } else {
            for (Room r : loadedRooms) {
                hotel.addRoom(r);
            }
        }

        while (true) {
            System.out.println("\nHOTEL BOOKING SYSTEM:");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        hotel.viewRooms();
                        break;

                    case 2:
                        System.out.print("Enter room number to book: ");
                        int bookNo = sc.nextInt();
                        hotel.bookRoom(bookNo);
                        System.out.println("Room booked successfully!");
                        break;

                    case 3:
                        System.out.print("Enter room number to cancel: ");
                        int cancelNo = sc.nextInt();
                        hotel.cancelBooking(cancelNo);
                        System.out.println("Booking cancelled successfully!");
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        DataManager.saveRooms(hotel.getRooms());
                        System.out.println("Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
