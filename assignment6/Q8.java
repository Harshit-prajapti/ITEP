    import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {-1,21,-3,14,-5,6,7,18,-9,10};
        System.out.println("Enter the sum : ");
        int s = sc.nextInt();        
        for(int i = 0; i<arr.length-1; i++){
           for(int j = 0; j<arr.length; j++){
                if(arr[i]<0 && arr[j] > 0){
                    int temp = arr[i];
                    arr[i] = arr[j];    
                    arr[j] = temp;
                }
           }
        }
        for(int k = 0; k<arr.length ; k++){
            System.out.print(arr[k]+" ");
        }
    }
}