    import java.lang.Math;
    import java.util.Scanner;
    class Test {
        public static void main(String args[]){
            System.out.println("Enter a number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int deivident = num;
            int pow = 16;
            while(num != 0){
                int div = (int)Math.pow(2,pow);
                // System.out.println(div);
                if(div>num){
                    pow--;
                    System.out.print("0 ");
                }else{
                    num = num - div;
                    pow--;
                    System.out.print("1 ");
                }
            }
            while(pow>=0){
                System.out.print("0 ");
                pow--;
            }
        }
    }