package travel.hotels;

public class Hotel {
    private String hotelName;
    private String location;
    private double price;

    public Hotel(String hotelName, String location, double price) {
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
    }

    public String getDetails() {
        return "Hotel: " + hotelName
                + "\nLocation: " + location
                + "\nPrice: Rs." + price + " per night";
    }
}
