//     A
//    AB
//   ABC
//  ABCD
// ABCDE

class Test{
    public static void main(String args[]){
        for(int i = 1; i<= 5; i++){
        char a = 'A';
        for(int k = 5; k>=1 ; k--){
            if(k<=i){
                System.out.print((char)(64+i));
            }else
            System.out.print(" ");
        }
        System.out.println();
}
    }
}
