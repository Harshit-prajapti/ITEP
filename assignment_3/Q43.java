// 28. Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter eletricity units");
        int unit = sc.nextInt();

        double amount = 0;
        if(unit <= 50){
            amount = unit * 0.50;
        }
        else if(unit <= 100){
            amount = unit * 0.75;
        }
        else if(unit < 250){
            amount = unit * 1.20;
        }
        else if(unit > 250){
            amount = unit * 1.50;
            double subcharge = amount * 20.0/100;
            amount = amount + subcharge;
        }
        System.out.println("Amount to be paid = "+ amount);
    }
}