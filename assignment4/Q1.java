import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement : ");
        String input = sc.nextLine();
        int i = 0;
        while (i<1000) {
            System.out.println(input);
            i++;
        }
    }
}
