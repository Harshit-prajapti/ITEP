interface SmartDevice {
    void connectWifi();
}
abstract class Application{
    private String name;
    private boolean power;
    public Application(String name){
        this.name = name;
    }
    abstract void turnOne();
    abstract void turnOff();
    public void changePower(){
        this.power = !power;
    }
    public void showStatus(){   
        System.out.println(name + " : " + power);
    }
}
class Fan extends Application {
    public Fan(String name){
        super(name);
    }
    public void turnOff(){
        System.out.println("Turning off...");
        changePower();
    }
    public void turnOne(){
        System.out.println("Turning on...");
        changePower();
    }
}
class Light extends Application implements SmartDevice{
    public Light(String name){
        super(name);
    }
    public void turnOff(){
        System.out.println("Turning off...");
        changePower();
    }
    public void turnOne(){
        System.out.println("Turning on...");
        changePower();
    }
    public void connectWifi(){
        System.out.println("Connection with wifi");
    }
}
class WasingMachine extends Application implements SmartDevice{
    public WasingMachine(String name){
        super(name);
    }
    public void turnOff(){
        System.out.println("Turning off...");
        changePower();
    }
    public void turnOne(){
        System.out.println("Turning on...");
        changePower();
    }
    public void connectWifi(){
        System.out.println("Connection with wifi");
    }
}
class Test{
    public static void main(String args[]){
        Application f1 = new Fan("Bajaj");
        f1.showStatus();
        f1.changePower();
        f1.showStatus();
    }
}