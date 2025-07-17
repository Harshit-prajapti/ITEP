import java.util.Scanner;

public class Pro24_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        

        int note500 = amount / 500;
        amount = amount % 500;

        int note200 = amount / 200;
        amount = amount % 200;

        int note100 = amount / 100;
        amount = amount % 100;

        int note50 = amount / 50;
        amount = amount % 50;

        int note20 = amount / 20;
        amount = amount % 20;

        int note10 = amount / 10;
        amount = amount % 10;

        int note5 = amount / 5;
        amount = amount % 5;

        int note2 = amount / 2;
        amount = amount % 2;

        int note1 = amount;  
        System.out.println("Number of notes:");
        
        System.out.println("500  = " + note500);
        System.out.println("200  = " + note200);
        System.out.println("100  = " + note100);

        System.out.println("50   = " + note50);
        System.out.println("20   = " + note20);
        System.out.println("10   = " + note10);
        System.out.println("5    = " + note5);
        System.out.println("2    = " + note2);
        System.out.println("1    = " + note1);
    }
}