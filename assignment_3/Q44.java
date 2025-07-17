//29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int n1 = sc.nextInt();
        System.out.println("enter number 2");
        int n2 = sc.nextInt();
        System.out.println("enter choice: +  addition | > for check greater | = for equality");
        int choice = sc.next().charAt(0);

        if(choice=='+'){
            System.out.println("Addition is = "+ (n1+n2));
        }
        else if(choice == '>'){
            if(n1>n2)   System.out.println("first number is greater");
            else    System.out.println("second number is greater");
        }
        else if(choice == '='){
             if(n1 == n2)   System.out.println("Both numbers are equal");
            else    System.out.println("Both number are different");
        }
        else{
            System.out.println("Wrong character");
        }
    }
}