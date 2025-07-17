// 3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.
import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you selery ");
        double salery = sc.nextDouble();
        System.out.println("Enter your years of service ");
        double years = sc.nextDouble();
        System.out.println((float)5/100);
        if(years >= 5){
            double bonus =(double)(salery * ((float)(5/100)));
            System.out.println("The net bonus is : "+bonus);
        }else{
            System.out.println("The net bonus is 0 ");
        }
    }
}
