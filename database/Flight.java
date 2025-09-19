import java.sql.*;
class DBConnection{
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/harsh"; // DB name
        String user = "root"; // Your MySQL username
        String password = "Harshit@2005"; 
        Connection con = null;
        try{
            // 1. Load MySQL JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to the database!");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
public class Flight{
    private String flightNumber;
    private String airlineName;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double travelDuration;
    private int businessSeats;
    private int economySeats;
    private int generalSeats;
    private double businessPrice;
    private double economyPrice;
    private double generalPrice;
    private double airportTax;
    private double environmentalCost;
    private double serviceCharge;
    private String flightStatus;
    private String date;
    public Flight(String flightNumber, String airlineName, String source, String destination,
                  String departureTime, String arrivalTime, double travelDuration,
                  int businessSeats, double businessPrice,
                  int economySeats, double economyPrice,
                  int generalSeats, double generalPrice,
                  double airportTax, double environmentalCost, double serviceCharge) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.travelDuration = travelDuration;
        this.businessSeats = businessSeats;
        this.businessPrice = businessPrice;
        this.economySeats = economySeats;
        this.economyPrice = economyPrice;
        this.generalSeats = generalSeats;
        this.generalPrice = generalPrice;
        this.airportTax = airportTax;
        this.environmentalCost = environmentalCost;
        this.serviceCharge = serviceCharge;
        this.flightStatus = "Scheduled";
    }
    public static void addRow(){
        try {
    Connection con = DBConnection.getConnection();
    Statement stmt = con.createStatement();

    String sql = "INSERT INTO flights (" +
            "flightNumber, airlineName, source, destination, " + "departureTime, arrivalTime, travelDuration, " + "businessSeats, economySeats, generalSeats, " +
            "businessPrice, economyPrice, generalPrice, " + "airportTax, environmentalCost, serviceCharge, " + "flightStatus, date" +") VALUES (" + "'AI202', " + "'Air India', " +
            "'New Delhi', " +
            "'Mumbai', " +
            "'10:00:00', " +
            "'12:30:00', " +
            "2.5, " +
            "10, " +
            "50, " +
            "100, " +
            "15000.00, " +
            "8000.00, " +
            "5000.00, " +
            "1200.00, " +
            "300.00, " +
            "500.00, " +
            "'ON_TIME', " +
            "'2025-09-15'" +
        ")";

    int rowsInserted = stmt.executeUpdate(sql);
    System.out.println(rowsInserted + " row(s) inserted successfully.");
    
    stmt.close();
    con.close();

} catch (Exception e) {
    e.printStackTrace();
}

    }
    public boolean bookSeat(String classType, int count) {
        switch(classType.toLowerCase().trim()) {
            case "business":
                if(businessSeats >= count) {
                    businessSeats -= count;
                    return true;
                }
                break;
            case "economy":
                if(economySeats >= count) {
                    economySeats -= count;
                    return true;
                }
                break;
            case "general":
                if(generalSeats >= count) {
                    generalSeats -= count;
                    return true;
                }
                break;
        }
        return false; // Booking failed
    }
    public double calculateTotalFare(String classType, int count) {
        double baseFare = 0;
        switch(classType.toLowerCase()) {
            case "business": baseFare = businessPrice; break;
            case "economy": baseFare = economyPrice; break;
            case "general": baseFare = generalPrice; break;
        }
        return (baseFare * count) + airportTax + environmentalCost + serviceCharge;
    }
    public String displayFlightDetails() {
    return "Flight: " + airlineName + " (" + flightNumber + ")\n" +
           "From " + source + " to " + destination + "\n" +
           "Departure: " + departureTime + " | Arrival: " + arrivalTime + "\n" +
           "Duration: " + travelDuration + " hrs\n" +
           "Status: " + flightStatus + "\n" +
           "Seats Available -> Business: " + businessSeats +
           ", Economy: " + economySeats +
           ", General: " + generalSeats;
}

}