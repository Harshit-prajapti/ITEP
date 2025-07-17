import java.util.Scanner;

public class Q31 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the peri of the tile in cm ");
        double peri = sc.nextDouble();
        double side = peri/4;
        double area = side * side;
        System.out.print(area);
        
    }
}
