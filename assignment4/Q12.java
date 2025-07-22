import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        int i = 1;
        int start = 1;
        while(start<=n){
            System.out.println(start + " ");
            i++;
            start = start + 2;
        }
    }
}