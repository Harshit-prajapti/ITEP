// 1
// 222
// 33333
// 4444444
// 555555555

class Test {
    public static void main(String args[]){
        int term = 1;
        for(int i = 1; i<= 5; i++){
            for(int j = 1; j<= term ; j++){
                System.out.print(i);
            }
            System.out.println();
            term = term + 2;
        }
    }
}
