import java.util.Scanner;
public class Eight {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the altitude of the Triangel : ");
    double altitude = sc.nextDouble();
    System.out.println("Enter the area of the Triangel : ");
    double area = sc.nextDouble();
    double areaInMeter = area * 100;
    double base = (areaInMeter/0.5 * altitude);
    System.out.println("height is : "+base);
    } 
}
