// import java.util.ArrayList;
import java.util.*;
class Category{
    private String name;
    private ArrayList<Product> products = new ArrayList<Product>();
    public Category(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Category: " + this.name;
    }
    public void addProduct(Product p){
        this.products.add(p);
    }
    public ArrayList<Product> getList(){
        return products;
    }
}
class Product {
    private String name;
    private int price;
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return "Product: " + this.name + ", Price: " + this.price;
    }
    
}
class Test{
    public static void main(String args[]){
        HashMap<String, ArrayList<Product>> hm = new HashMap<String, ArrayList<Product>>();
        Category c1 = new Category("Electronics");
        Category c2 = new Category("Furniture");
        Product p1 = new Product("TV", 50000);
        c1.addProduct(p1);
        Product p2 = new Product("Sofa", 30000);
        c2.addProduct(p2);
        Product p3 = new Product("Laptop", 70000);
        c1.addProduct(p3);
        hm.put(c1.getName(),c1.getList());
        hm.put(c2.getName(),c2.getList());

        Set<Map.Entry<String,ArrayList<Product>>> mySet = hm.entrySet();
        
        for(Map.Entry<String,ArrayList<Product>> s : mySet){
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }

       
    }
}