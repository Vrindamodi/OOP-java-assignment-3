package travel.bookings;

import travel.flights.Flight;
import travel.hotels.Hotel;

public class Booking {

    public void bookFlight(Flight f) {
        System.out.println("Flight booked successfully!");
        System.out.println(f.getDetails());
    }

    public void bookHotel(Hotel h) {
        System.out.println("Hotel booked successfully!");
        System.out.println(h.getDetails());
    }
}
