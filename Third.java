import java.util.Scanner;
public class Third {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Breadth of the tile : ");
        double breadth = sc.nextDouble();
        System.out.println("Enter the lenth of the tile: ");
        double length = sc.nextDouble();
        System.out.println("Enter the length of the region to be cover : ");
        double regionLength = sc.nextDouble();
        System.out.println("Enter the breadth of the region to be cover : ");
        double regionBreadth = sc.nextDouble();
        double tileArea = breadth * length;
        double regionArea = regionBreadth * regionLength;
        System.out.println("There are " + regionArea / tileArea + " tiles are needed to cover this area ");
    }
}
