//     5
//    44
//   333
//  2222
// 11111

class Test{
    public static void main(String args[]){
        for(int i = 1; i<= 5; i++){
        for(int k = 5; k>=1 ; k--){
            if(k<=i){
                System.out.print(6-i);
            }else
            System.out.print(" ");
        }
        System.out.println();
}
    }
}