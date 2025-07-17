import java.util.Scanner;

public class Q15 {
    public static void main(String args[]){

    System.out.println("Enter the price of you bick : ");
    Scanner sc = new Scanner(System.in);
    double cost = sc.nextDouble();
    if(cost > 100000){
        cost = cost + (cost * 15.0/100.0);
        System.out.println(cost);
    }
    else if (cost > 50000 && cost <= 100000){
        cost = cost + (cost * 10.0/100.0);
        System.out.println(cost); 
    }
    else if (cost <= 50000 && cost >= 0){
        cost = cost + (cost * 5.0/100.0); 
        System.out.println(cost);
    }else{
        System.out.println("Invalid input");
    }
}
}
