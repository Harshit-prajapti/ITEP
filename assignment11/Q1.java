interface Chargeable {
    public void chargeBattery();
}
abstract class Vehicle{
    private String registerNumber;
    public Vehicle(String registerNumber){
        this.registerNumber = registerNumber;
    }
    abstract public void start();
    abstract public void stop();
    public void displayInto(){
        System.out.print(registerNumber + " ");
    }
}
class Car extends Vehicle{
    public Car(String registerNumber){
        super(registerNumber);
    }
    public void start(){
        System.out.println("strting with petrol engine...");
    }
    public void stop(){
        System.out.println("stopped...");
    }
}
class Truck extends Vehicle{
    public Truck(String registerNumber){
        super(registerNumber);
    }
    public void start(){
        System.out.println("starting with disel engine...");
    }
    public void stop(){
        System.out.println("stopped");
    }
}
class ElectricBick extends Vehicle implements Chargeable{
    public ElectricBick(String registerNumber){
        super(registerNumber);
    }
    public void start(){
        System.out.println("starting silently...");
    }
    public void stop(){
        System.out.println("stopped");
    }
    public void chargeBattery(){
        System.out.println("battery chargin...");
    }
}
class ElectricCar extends Vehicle implements Chargeable{
    public ElectricCar(String registerNumber){
        super(registerNumber);
    }
    public void start(){
        System.out.println("staring siglently");
    }
    public void stop(){
        System.out.println("stopped");
    }
    public void chargeBattery(){
        System.out.println("battery chargin...");
    }
}
class Test{
    public static void main(String args[]){
        Car c1 = new Car("Car KA01AB1234");
        Truck t1 = new Truck("Truck KA02XY9876");
        ElectricBick eb = new ElectricBick("Electric Bike KA03EL5678");
        ElectricCar e1 = new ElectricCar("Electric Car KA04EV4321");
        c1.displayInto();
        c1.start();
        c1.displayInto();
        c1.stop();
        t1.displayInto();
        c1.start();
        t1.displayInto();
        c1.stop();
        eb.displayInto();
        eb.start();
        eb.displayInto();
        eb.chargeBattery();
        eb.stop();
        e1.displayInto();
        e1.start();
        e1.chargeBattery();

        e1.stop();
    }
}