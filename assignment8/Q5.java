class Product{
    private int productId ;
    private String name;
    private int quantity;
    private float price;
    public void setProductId(int id){
        this.productId = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQuantity(int qu){
        this.quantity = qu;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void display(){
        System.out.printf(productId+"\n"+name+"\n"+quantity+"\n"+price);
    }
}
class Test{
    public static void main(String args[]){
        Product p = new Product();
        p.setProductId(1234);
        p.setName("Harshit");
        p.setQuantity(50);
        p.setPrice(555.5f);
        p.display();
    }
}