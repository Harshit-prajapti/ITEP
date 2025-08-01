import java.util.Scanner;
class Test {
    public static void main(String args[]){
       int arr[] = {4,53,5,6,4,3,56,4,3,5,11};
       int size = 11;
        for(int i = 0; i<size/2; i++){
            int temp = arr[size-i-1];
            arr[size-i-1] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0 ; i<size; i++){
            System.out.print(arr[i]+" ");
        }
               

    }
}