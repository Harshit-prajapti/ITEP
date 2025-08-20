//     1
//    11
//   1*1
//  1**1
// 11111


class Test{
    public static void main(String ar[]){
        for(int i = 1; i<= 5; i++){
            int k; 
            for(k = 1; k>=5-i; k++){
                System.out.print(" ");
            }
            for(int j = k; j<=5 ; j++){
                System.out.print("*");
            }
            System.out.println();   
        }
    }
}