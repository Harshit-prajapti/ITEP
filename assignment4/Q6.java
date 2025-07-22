import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        int i = 2;
        while(n!=1){
            if(n%i == 0){
                n = n/i;
                System.out.println(i+" ");
            }else{
                i++;
            }
        }
    }
}