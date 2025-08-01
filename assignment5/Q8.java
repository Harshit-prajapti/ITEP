import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        for(int i = 0;i<size; i++){
            System.out.println("Enter the value of element "+(i+1)+" ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to insert : ");
        int ele = sc.nextInt();
        System.out.println("Enter the position to insert : ");
        int pos = sc.nextInt();
        for(int i = size-1; i>pos;i--){
            int j;
            arr[i+1] = arr[i];
            if(i == 7) int temp = 7
        }

    }
}