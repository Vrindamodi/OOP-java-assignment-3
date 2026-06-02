package travel.flights;

public class Flight {
    private String flightNumber;
    private String destination;
    private double price;

    public Flight(String flightNumber, String destination, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    public String getDetails() {
        return "Flight: " + flightNumber
                + "\nDestination: " + destination
                + "\nPrice: Rs." + price;
    }
}
