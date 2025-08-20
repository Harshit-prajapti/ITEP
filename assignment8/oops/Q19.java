import java.util.ArrayList;
import java.util.Scanner;
class Reservation{
    private String flightNumber;
    private String hotelName;
    public Reservation(String flightNumber, String hotelName){
        this.flightNumber = flightNumber;
        this.hotelName = hotelName;
    }
    public void printReservation(){
        System.out.println("Reservation of flight "+flightNumber + " hotel "+ hotelName + " is complete");
    }
}
class Flight{
    private String from;
    private String to;
    private String flightNumber;
    ArrayList<Flight> flights = new ArrayList<Flight>();
    public Flight(String from, String to, String flightNumber){
        this.from = from;
        this.to = to;
        this.flightNumber = flightNumber;
    }
    public void getFlightDetails(){
        System.out.println("Flight "+flightNumber+" for "+from+" to "+to);
    }
    public void getAllFlightDetails(){
        for(Flight f : flights){
            f.getFlightDetails();
        }
    }
    public void addFlight(Flight f){
        flights.add(f);
    }
    public String searchFlight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting location : ");
        String from = sc.next();
        System.out.println("Enter your destination : ");
        String to = sc.next();
        String result = "Not found";
        for(Flight f : flights){
            String start = f.from;
            String dest = f.to;
            if(start.equals(from) && dest.equals(to)){
                result = f.flightNumber;
            }
        }
        return result;
    }
}
class Hotel {
    private String name;
    private String location;
    ArrayList<Hotel> hotels = new ArrayList<Hotel>();
    public Hotel(String name, String location){
        this.name = name;
        this.location = location;
    }
    public void addHotel(Hotel h){
        hotels.add(h);
    }
    public String searchHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the location to find the hotel : ");
        String hotel = sc.next();
        String result = "Not found";
        for(Hotel h : hotels){
            if(h.location.equals(hotel)){
                result = h.name;
            }
        }
        return result;
    }
}
class Test{
    public static void main(String args[]){
        Flight f1 = new Flight("Indore","Goa","F0001");
        Flight f2 = new Flight("Indore","Mumbai","F0002");
        Flight f3 = new Flight("Indore","Delhi","F0003");
        Hotel h1 = new Hotel("Hotel Wow 3*","Goa");
        Hotel h2 = new Hotel("Burjal Al Arab 7*","Mumbai");
        Hotel h3 = new Hotel("Sukhvilaa 1*","Delhi");
        h1.addHotel(h1);
        h1.addHotel(h2);
        h1.addHotel(h3);
        f1.addFlight(f1);
        f1.addFlight(f2);
        f1.addFlight(f3);        
        String flightNumber = f1.searchFlight();
        String hotelName = h1.searchHotel();
        Reservation myreservation = new Reservation(flightNumber,hotelName);
        myreservation.printReservation();

    
    }   
}
