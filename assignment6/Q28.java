import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array P: ");
        int n = sc.nextInt();
        int[] P = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            P[i] = sc.nextInt();
        }

        System.out.print("Enter the value to search (VAL): ");
        int val = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (P[i] == val) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
