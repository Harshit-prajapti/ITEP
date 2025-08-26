// 18) Create class Product (pid, price, quantity) with parameterized constructor.Create a main
//  function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate 
// and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).
import java.util.Scanner;
class Product{
    private int pid;
    private int price;
    private int quantity;
    public Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public int getPrice(){
        return price;
    }
    public int getId(){
        return pid;
    }
}
class Test{
    public static int calculateTotalAmount(Product arr[]){
            int sum = 0;
            for(int i = 0; i<5; i++){
                sum += arr[i].getPrice();
            }
            return sum;
    }
    public static int ProductIdWithHigerPrice(Product arr[]){
        Product higher = arr[0];
        int highest = arr[0].getPrice();
        for(int i = 1; i<5; i++){
            if(highest < arr[i].getPrice()) higher = arr[i];
        }
        return higher.getId();
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Product arr[] = new Product[5];
        for(int i = 0; i<5; i++){
            int pid,price,quantity;
            System.out.println("Enter the Product Id : ");
            pid = sc.nextInt();
            System.out.println("Enter the Product price : ");
            price = sc.nextInt();
            System.out.println("Enter the quantity : ");
            quantity = sc.nextInt();
            Product obj = new Product(pid,price,quantity);
            arr[i] = obj;
        }
         
        System.out.println("The total amount is : "+calculateTotalAmount(arr));
        System.out.println("P id with higer price : "+ProductIdWithHigerPrice(arr));

    }
}

