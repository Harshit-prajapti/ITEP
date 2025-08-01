import java.util.Scanner;
class Test{
    public static void main(String args[]){
      int arr[] = {1,5,7,1};
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sum : ");
      int sum = sc.nextInt();
      int count = 0;
      for(int i = 0; i<arr.length-1; i++){
        for(int j = i+1 ; j<arr.length ; j++){
            if(arr[i] + arr[j] == sum){
                count++;
            }
        }
      }
      System.out.print(count);
    }
}