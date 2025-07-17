// 10.Write a program to check if a year is leap year or not.
// If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. 

import java.util.Scanner;

public class Q10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year < 0){
            System.out.println("Invlalid input");
        }
        if(year%4 != 0){
            System.out.println("This is not a leap year");
        }else {
            if(year%4 == 0 ){
            if(year % 100 == 0 && year % 400 != 0){
                System.out.println("It is not a leap year");
            }else{
                 System.out.println("It is a leap year");
            }
        }
        }
        
    }
}
