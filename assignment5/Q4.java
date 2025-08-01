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
        System.out.println("Enter the element to find : ");
        int ele = sc.nextInt();
        int i;
        for(i = 0; i<num ; i++){
            if(arr[i] == ele){
                break;
            }
        }
        if(i != num){
            System.out.print("Element exists in array ");
        }else 
        System.out.println("Element does not exists ");
    }
}