import java.util.Scanner;
class Test {
    public static void main(String args[]){
        int arr[] = {3,4,53,2,6,4,56,4,3,5};
        for(int i = 0; i<arr.length-1 ; i++){
            for(int j = i+1; j<arr.length; j++){
                int temp = arr[i];
               if(arr[i]>arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
               }
            }
         
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }

    }
}