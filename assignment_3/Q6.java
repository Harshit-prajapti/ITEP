// 6. Write a program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1
import java.util.Scanner;
public class Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        double num = sc.nextDouble();
        if(num < 0){
            num = num * (-1);
        }
        System.out.println("The absolute value of this number is : "+num);
    }
}
