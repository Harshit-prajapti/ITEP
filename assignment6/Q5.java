import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,53,5,6,4,6,3,5,6,7};
        System.out.println("Enter the term of minimum array : ");
        int min = sc.nextInt();
        System.out.println("Enter the term of minimum array : ");
        int max = sc.nextInt();
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i + 1; j<arr.length ; j++ ){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("The "+min+"th "+" minimum array is : " + arr[min]);
        System.out.println("The "+min+"th "+" maximum array is : " + arr[max]);
    }
}