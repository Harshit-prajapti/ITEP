// 1
// 22
// 3 3
// 4  4
// 55555

class Test {
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1;j<=i;j++){
                if(j == 1 || i == 5 || j == i){
                    System.out.print(i);
                    continue;
                }
                System.out.print(" ");
            }
            
            System.out.println();
        }
        }
    }