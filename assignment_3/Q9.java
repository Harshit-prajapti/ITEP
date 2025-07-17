// 9. Write a program to check whether
//  a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

import java.util.Scanner;
public class Q9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sinle character : ");
        String input = sc.nextLine();
        char ch = input.charAt(0);
        int num = (int)ch;
        if(num>=65 && num <= 90){
            System.out.println("This is in Upper case");
        }
        else if (num >= 97 && num <= 122) {
            System.out.println("This is in Lower case");
        }
        else 
            System.out.println("Invalid input");
        // int a = (int)'a';
        // int z = (int)'z';
        // System.out.println("a : "+a+" z : "+z);
        // int A = (int)'A';
        // System.out.println(A);
        // int Z = (int)'Z';
        // System.out.println(Z);

    }
}
