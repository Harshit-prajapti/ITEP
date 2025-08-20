// 1
// 123
// 12345
// 1234567
// 123456789
class Test{
    public static void main(String args[]){
        int term = 1;
        for(int i = 1; i<=5; i++){
            for(int j = 1 ; j <= term; j++){
                System.out.print(j);
            }
            term = term + 2;
            System.out.println();
        }   
    }
}