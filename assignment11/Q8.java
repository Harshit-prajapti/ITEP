interface DiscountApplicable {
    void applyDiscount();
}
abstract class Order{
    private int orderId;
    private int amount;
    abstract void processOrder();
    abstract void cancleOrder();
    public void orderSummary(int dis = 0){
        System.out.printf("Order Id : "+orderId+" Amount : "+amount+" -"+dis+" = "+(amount-dis));
    }
}
class OnlineOrder extends Order{
    private int discount;
    public void processOrder(){
        Syste.out.println("Processing order...");
    }
    public void cancleOrder(){
        System.out.println("Order cancled");
    }
    public void applyDiscount(int dis){
        this.discount = dis;
    }
}
class StorePickupOrder extends Order{
     private int discount;
    public void processOrder(){
        Syste.out.println("Processing order...");
    }
    public void cancleOrder(){
        System.out.println("Order cancled");
    }
    public void applyDiscount(int dis){
        this.discount = dis;
    }
}
class Test{
    public static void main(String args[]){
        
    }
}