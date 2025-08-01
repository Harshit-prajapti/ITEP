// 1
// 10
// 101
// 1010
// 10101

class Test {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            int print = 1;
            for(int j=1;j<=i;j++){
                System.out.print(print);
                if(print == 0)print = 1;
                else print = 0;
            }
            
            System.out.println();
        }
        }
    }