// 2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.
import java.util.Scanner;
public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Purchased quantity : ");
        double amount = sc.nextDouble();
        if(amount<0)
            System.out.println("Invalid Input");
        else {
        amount = amount * 100;
        if(amount >= 1000){
            double discount = amount * (0.1);
            amount = amount - discount;
            System.out.println("Total cose user have to pay is : "+amount);
        }else {
            System.out.println("Total cose user have to pay is : "+amount);
        }
    }
    }   
}
