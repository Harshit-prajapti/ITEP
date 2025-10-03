import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
class Category {
    private String name;
    public Category(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}
class Product extends Category{
    private String productName;
    private int productPrice;
    public Product(String categoryName,String productName, int productPrice){
        super(categoryName);
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public void getData(){
        System.out.println(this.getName() + " " + this.productName + " "+this.productPrice);
    }
}
class Test{
    public static void main(String args[]){
        HashMap<String,ArrayList<Category>> hm = new HashMap<String,ArrayList<Category>>();
        Category p = new Product("Funiture","Table",4000);
        Category c = new Product("Cosmatics","Lipstick",500);
        Category e = new Product("Electronics","TV",35000);
        Category p2 = new Product("Funiture","Table",4100);
        Category c2 = new Product("Cosmatics","Lipstick",600);
        Category e2 = new Product("Electronics","TV",32000);
        ArrayList<Category> Funiture = new ArrayList<Category>();
        ArrayList<Category> Cosmatics = new ArrayList<Category>();
        ArrayList<Category> Electronics = new ArrayList<Category>();
        Funiture.add(p);
        Cosmatics.add(c);
        Electronics.add(e);
        Funiture.add(p2);
        Cosmatics.add(c2);
        Electronics.add(e2);
        hm.put("Funiture",Funiture);
        hm.put("Cosmatics",Cosmatics);
        hm.put("Electroncs",Electronics);
        Set<Map.Entry<String,ArrayList<Category>>> mySet = hm.entrySet();
        Iterator<Map.Entry<String,ArrayList<Category>>> it = mySet.iterator();
        while(it.hasNext()){
            Map.Entry ele = it.next();
            ArrayList<Product> list = (ArrayList<Product>)ele.getValue();
            for(int i = 0; i<list.size(); i++){
                list.get(i).getData();
            }
        }
    }
}