//     *
//    ***
//   *****
//  *******
// *********
class Test {
    public static void main(String args[]){
        for(int i = 4; i>=1; i--){
            for(int j = 1; j<=9; j++){
                if(j>i && j<9-(i-1)){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}