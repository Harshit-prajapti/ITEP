import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i<num; i++){
            System.out.println("Enter the value of element "+(i+1)+" ");
            arr[i] = sc.nextInt();
        }
        int odd = 0;
        int even = 0;
        for(int i = 0; i<num ; i++){
            if(arr[i]%2 == 0) 
                even += arr[i];
            else
                odd += arr[i];
        }
        System.out.println("Sum of even elements of array : "+even);
        System.out.print("Sum of odd elements of array : "+odd);

    }
}