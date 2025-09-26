package Chapter_4;

public class DebugTrip
{
    private String destination;
    private String departure;
    private String mode;
    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    public DebugTrip(String destination)
    {
        this.destination = destination;
        this.departure = DEFAULT_CITY;
        this.mode = DEFAULT_MODE;
    }

    public DebugTrip(String destination, String departure)
    {
        this.destination = destination;
        this.departure = departure;
        this.mode = DEFAULT_MODE;
    }

    public DebugTrip(String destination, String departure, String mode)
    {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination()
    {
        return destination;
    }

    public String getDepartureCity()
    {
        return departure;
    }

    public String getMode()
    {
        return mode;
    }

    public static void main(String[] args)
    {
        DebugTrip trip1 = new DebugTrip("Cebu");
        DebugTrip trip2 = new DebugTrip("Davao", "Manila");
        DebugTrip trip3 = new DebugTrip("Baguio", "Quezon City", "bus");

        System.out.println("Trip 1: " + trip1.getDestination() + " from " + trip1.getDepartureCity() + " by " + trip1.getMode());
        System.out.println("Trip 2: " + trip2.getDestination() + " from " + trip2.getDepartureCity() + " by " + trip2.getMode());
        System.out.println("Trip 3: " + trip3.getDestination() + " from " + trip3.getDepartureCity() + " by " + trip3.getMode());
    }
}