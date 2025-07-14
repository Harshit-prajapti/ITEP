import java.util.Scanner;
public class Second {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the area of the rectange");
    double area = sc.nextDouble();
    System.out.println("Enter the breadth of the rectange");
    double breadth = sc.nextDouble();
    double len = area/breadth;
    double peri = 2*(breadth + len);
    System.out.println("Length is : "+len+" perimeter is : "+ peri);
    }
}
