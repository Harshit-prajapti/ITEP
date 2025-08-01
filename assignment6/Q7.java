    import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the sum : ");
        int s = sc.nextInt();        
        boolean flage = false;
        int i;
        int j = 0;
        for(i = 0; i<arr.length-1; i++){
            int sum = arr[i];
            for(j = i + 1; j<arr.length ; j++ ){
                if(sum>s) continue;
                sum += arr[j];
                if(sum == s){
                    flage = true;
                    break;
                }
            }
            if(flage){
                break;
            }
        }
        System.out.println((i+1)+" th to "+(j+1));
    }
}