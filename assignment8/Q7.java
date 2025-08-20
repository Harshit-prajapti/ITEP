class PhoneStore{
    private String brand;
    private String model ;
    private float price;
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void display(){
        System.out.printf(brand+"\n"+model+"\n"+price);
    }

}
class Test{
    public static void main(String args[]){
        PhoneStore p = new PhoneStore();
        p.setBrand("LAVA");
        p.setPrice(100000);
        p.setModel("L1");
        p.display();
    }
}