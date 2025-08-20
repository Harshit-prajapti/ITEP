//     1
//    22
//   333
//  4444
// 55555
class Test{
    public static void main(String args[]){
        for(int i = 1; i<= 5; i++){
        for(int k = 5; k>=1 ; k--){
            if(k<=i){
                System.out.print(i);
            }else
            System.out.print(" ");
        }
        System.out.println();
}
    }
}