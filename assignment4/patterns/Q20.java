// 1
// 12
// 1 3
// 1  4
// 12345

    class Test {
        public static void main(String args[]){
            for(int i=1; i<=5; i++){
                for(int j=1;j<=i;j++){
                    if(j == 1 || i == 5 || j == i){
                        System.out.print(j);
                        continue;
                    }
                    System.out.print(" ");
                }
                
                System.out.println();
            }
            }
        }