    import java.util.Scanner;
class Test {
    public static void main(String args[]){
        int arr[] = {-1,5, 2, -1, 3, 2};
        boolean dubli[] = new boolean[arr.length];
        for(int i = 0; i<arr.length-1; i++){
           for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    dubli[i] = true;
                    dubli[j] = true;
                };
           }
        }
        for(int i = 0 ; i<dubli.length ; i++){
            if(dubli[i] == false){
                System.out.println(arr[i]+" is the first non-dublicate element of this array ");
                break;
            }
        }
    }
}