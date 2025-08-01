import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = n;
            int k = n-i;
            while(j>=1){
                if(k>0){
                    System.out.print(" ");
                    k--;
                }else{
                    System.out.print("*");
                }
                j--;
            }
            System.out.println();
            i++;
        }
    }
}