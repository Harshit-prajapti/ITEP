import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        int mul = 1;
        while (n>0){
            mul = mul * n;
            n--;
        }
        System.out.println(mul);
    }
}