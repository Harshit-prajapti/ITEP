import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the terms : ");
        int n = input.nextInt();
        int i = 1;
        double sum = 0;
        while (i<=n) {
            sum += i;
            if(i == 1){
                System.out.print("1");
            }else
            System.out.print(1+"/"+i);
            sum = sum + (1.0/i);
            System.out.print(" + ");
            i++;
    
        }
        System.out.println();
        System.out.println(sum);
    }
}
