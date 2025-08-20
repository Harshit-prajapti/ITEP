// a
// bc
// d f
// g  j
// klmno

class Test{
    public static void main(String args[]){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                if(j == 1 || i == 5 || j == i)
                System.out.print((char)(96+j));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}



// class Test{
//     public static void main(String args[]){
//         for(int i = 1; i<=7; i++){
//             for(int j = 1; j<=7; j++){
//                 if(i == 7 || j == 1 || i == j)
//                     System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }