import java.util.Scanner;

public class BinarySearchAscending {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array AR (ascending order): ");
        int n = sc.nextInt();
        int[] AR = new int[n];

        System.out.println("Enter " + n + " elements in ascending order:");
        for (int i = 0; i < n; i++) {
            AR[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        int result = binarySearch(AR, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
