import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int n = scanner.nextInt();
        int i = 1,sum = 0;
        while (i<=n){
        System.out.print(i+ " ");
        i++;
        }
    }
}