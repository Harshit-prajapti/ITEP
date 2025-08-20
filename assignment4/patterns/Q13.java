// 1
// 01
// 101
// 0101
// 10101


class Test {
    public static void main(String args[]){
        int print = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(print);
                if(print == 0) print = 1;
                else print = 0;
                
            }
            System.out.println();
            if(i%2 != 0){
                print = 0;
            }else print = 1;
            
        }
        }
    }
