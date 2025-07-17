import java.util.Scanner;

public class Q34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the triangle ");
        double base_l = sc.nextDouble();
        System.out.println("Enter the bridth of the triangle ");
        double base_w = sc.nextDouble();
        System.out.println("Enter the height of the triangle ");
        double height = sc.nextDouble();        
        System.out.println("Enter the pathway_w in cm ");
        double pathway_w = sc.nextDouble();
        System.out.println("Enter the pathway_h in cm ");
        double pathway_h = sc.nextDouble();
        double pathway_area = pathway_h * pathway_w;
        double area = (base_w+base_l) * (height/2);
        double totoal_area = pathway_area + area;
        System.out.println(totoal_area);        
    }
}
