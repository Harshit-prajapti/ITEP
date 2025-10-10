import java.util.Scanner;

public class MergeArraysPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array A: ");
        int m = sc.nextInt();
        int[] A = new int[m];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter size of array B: ");
        int n = sc.nextInt();
        int[] B = new int[n];
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[m + n];
        int left = 0;
        int right = m + n - 1;

        for (int i = 0; i < m; i++) {
            if (A[i] % 2 == 0) {
                C[left++] = A[i];
            }
        }

        for (int i = 0; i < m; i++) {
            if (A[i] % 2 != 0) {
                C[right--] = A[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (B[i] % 2 == 0) {
                C[left++] = B[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (B[i] % 2 != 0) {
                C[right--] = B[i];
            }
        }

        System.out.println("Resultant array C:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
