// 1
// 10
// 1 1
// 1  0
// 10101



class Test {
    public static void main(String args[]){
        for(int i = 1 ; i<= 5; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || i == 5 || j == i){
                    if(j % 2 == 0) System.out.print("0");
                    else System.out.print("1");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}