// 4. E-commerce Discount Calculation
// Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens
// Which exception will occur?
// How will you ensure the program continues and doesn’t stop execution?
import java.util.Scanner;
class ECommerce{
    public void calculateDiscount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount : ");
        int amount = sc.nextInt();
        System.out.print("Enter the total quantity : ");
        int quantity = sc.nextInt();
        int price = 0;
        try{
            price = amount/quantity;
        }catch(ArithmeticException e){
            System.out.println("Quantity can't be zero please try again");
        }
        int dis = price / 10;
        System.out.println("You got "+dis+" rupees discount on every product");
    }
}
class Test{
    public static void main(String arg[]){
    ECommerce e = new ECommerce();
    e.calculateDiscount();
    }
}