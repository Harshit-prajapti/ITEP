import java.util.Scanner;
class Test {
    public static void main(String args[]){
        int arr[] = {1,0,0,1,0,1,1};
        boolean dubli[] = new boolean[arr.length];
        
        int result = 0;
        for(int i = 0; i<arr.length-1; i++){
            int zeros = 0;
            int ones = 0;   
            if(arr[i] == 0) zeros++;
            else ones++;
           for(int j = i+1; j<arr.length; j++){
                
                if(arr[j] == 0){
                    zeros++;
                }
                if(arr[j] == 1){
                    ones++;
                }
                if(zeros == ones){
                    result++;   
                }
           }
        }
        System.out.print(result);
    }
}