import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("")
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i<num; i++){
            System.out.println("Enter the value of element "+(i+1)+" ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<num ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}