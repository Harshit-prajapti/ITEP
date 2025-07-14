import java.util.Scanner;
public class Fourth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the ploat to be cover : ");
        double regionLength = sc.nextDouble();
        System.out.println("Enter the breadth of the ploat to be cover : ");
        double regionBreadth = sc.nextDouble();
        double area = regionBreadth * regionLength;
        double num = area/100;
        double cost = num * 6;
        System.out.println("The cost for the tilling the ploat is : "+cost);
    }
}
