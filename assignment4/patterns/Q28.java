//     1
//    11
//   1*1
//  1**1
// 11111
class Test {
    public static void main(String args[]){
    for(int i = 1; i<= 5; i++){
    for(int j = 1; j<=5-i; j++){
        System.out.print(" ");
    }
    for(int k = 5; k>5-i; k--){
        if(k == 5 && k == (5-i)){
            System.out.print("1");
        }
    }
        System.out.println();
}
    }
}

