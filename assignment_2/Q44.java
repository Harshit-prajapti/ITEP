import java.util.Scanner;
  class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a1");
        int a1 = sc.nextInt();

        System.out.println("Enter a2");
        int a2 = sc.nextInt();
        int d = a2-a1;

        System.out.println("Enter nth term");
        int n = sc.nextInt();

        int sumOfTerms = (n/2)*(2*a1+(n-1)*d);
        System.out.println(sumOfTerms);


    }
  }