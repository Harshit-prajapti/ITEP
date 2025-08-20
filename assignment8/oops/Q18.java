import java.util.ArrayList;
import java.util.Scanner;
class Restaurnet{
    ArrayList<Menu> arr = new ArrayList<Menu>();
    public void addItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item : ");
        String item = sc.nextLine();
        System.out.println("Enter the price : ");
        float price = sc.nextFloat();
        System.out.println("Enter the Rating : ");
        float rating = sc.nextFloat();
        Menu myMene = new Menu(item,price,rating);
        arr.add(myMene);
    }
    public void printAllDetails(){
        for(Menu m : arr){
            m.printDetails();
        }
    }
    public float calculateAverateRating(){
        float total = 0;
        for(Menu m : arr){
            total = total + m.getRating();
        }
        float avgRating = total / (arr.size());
        return avgRating;
    }
}
class Menu{
    private String item;
    private float price;
    private float rating;
    public Menu(String item, float price, float rating){
        this.item = item;
        this.price = price;
        this.rating = rating;
    }
    public void printDetails(){
        System.out.println("Item : "+item+" price : "+price+" rating "+rating);
    }
    public float getRating(){
        return rating;
    }
}
class Test{
    public static void main(String args[]){
        Restaurnet myRestarunt = new Restaurnet();
        myRestarunt.addItem();
        myRestarunt.addItem();
        myRestarunt.addItem();
        myRestarunt.printAllDetails();
        float avgRating = myRestarunt.calculateAverateRating();
        System.out.println();
        System.out.print("Average rating is : "+avgRating);
    }
}