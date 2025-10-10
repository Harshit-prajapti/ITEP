import java.util.Scanner;

public class MergeAscDescToAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array A: ");
        int m = sc.nextInt();
        int[] A = new int[m];
        System.out.println("Enter " + m + " elements of array A in ascending order:");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter size of array B: ");
        int n = sc.nextInt();
        int[] B = new int[n];
        System.out.println("Enter " + n + " elements of array B in descending order:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[m + n];
        int i = 0;         // Pointer for A
        int j = n - 1;     // Pointer for B (start from end since B is descending)
        int k = 0;         // Pointer for C

        while (i < m && j >= 0) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j--];
            }
        }

        while (i < m) {
            C[k++] = A[i++];
        }

        while (j >= 0) {
            C[k++] = B[j--];
        }

        System.out.println("Merged array C in ascending order:");
        for (int num : C) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
