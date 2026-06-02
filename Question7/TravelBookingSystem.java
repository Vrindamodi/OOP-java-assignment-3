import travel.bookings.Booking;
import travel.flights.Flight;
import travel.hotels.Hotel;

public class TravelBookingSystem {
    public static void main(String[] args) {
        Flight flight = new Flight("AI-202", "Goa", 6500);
        Hotel hotel = new Hotel("Sea View Resort", "Goa", 4500);
        Booking booking = new Booking();

        System.out.println("Travel Booking Details:");

        booking.bookFlight(flight);
        System.out.println();
        booking.bookHotel(hotel);
    }
}
