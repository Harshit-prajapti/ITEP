import java.util.Scanner;

public class Q16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangular : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the triangle ");
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("Tina wants corepet of "+ area + " Methers.");        
    }
}
