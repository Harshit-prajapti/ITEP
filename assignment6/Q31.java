import java.util.Scanner;

public class MergeDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array X: ");
        int m = sc.nextInt();
        int[] X = new int[m];
        System.out.println("Enter " + m + " elements of array X in descending order:");
        for (int i = 0; i < m; i++) {
            X[i] = sc.nextInt();
        }

        System.out.print("Enter size of array Y: ");
        int n = sc.nextInt();
        int[] Y = new int[n];
        System.out.println("Enter " + n + " elements of array Y in descending order:");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }

        int[] Z = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (X[i] >= Y[j]) {
                Z[k++] = X[i++];
            } else {
                Z[k++] = Y[j++];
            }
        }

        while (i < m) {
            Z[k++] = X[i++];
        }

        while (j < n) {
            Z[k++] = Y[j++];
        }

        System.out.println("Merged array Z in descending order:");
        for (int num : Z) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
