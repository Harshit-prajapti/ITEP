class CarInfoManager {
    private String model ;
    private String brand;
    private String year;
    public void setModel(String ac) {
        this.model = ac;
    }
    public void setBradn(String name) {
        this.brand = name;
    }
    public void setYear(String ac) {
        this.year = ac;
    }
    public void display(){
        System.out.println(model+"\n"+brand+"\n"+year);
    }
}
class Test{
    public static void main(String args[]){
        CarInfoManager ac = new CarInfoManager();
        ac.setModel("My model");
        ac.setBradn("Toyota");
        ac.setYear("2019");
        ac.display();
    }
}