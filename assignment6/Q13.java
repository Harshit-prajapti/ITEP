    import java.util.Scanner;
class Test {
    public static void main(String args[]){
        int arr[] = {-1,-1,2, 2, -1, 3, 2,3};
        boolean flage = false;
        int diff = arr.length;
        int var = 0;
        for(int i = 0; i<arr.length-1; i++){
            // if(flage) break;
           for(int j = i+1; j<arr.length; j++){
            if(arr[i] == arr[j]){
                if((j-i)<diff){
                    diff = j-i;
                    var = arr[i];
                }
                // break;
            }
           }
        }
        System.out.print(var);
    }
}