import java.util.Scanner;
public class Five {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost  : ");
        double cost = sc.nextDouble();
        System.out.println("Enter the rate of the fancing : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the len of the fancing : ");
        double len = sc.nextDouble();     
        double area = cost / rate;
        double bre = area/len;
        System.out.println("Breadth : "+bre);
        System.out.println("Area : "+area);

    }
}
