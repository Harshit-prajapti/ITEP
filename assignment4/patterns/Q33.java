
// ABCDE
// ABCD
// ABC
// AB
// A

class Test{
    public static void main(String args[]){
        for(int i = 5; i>=1 ;i--){
            char term = 'A';
            for(int j = 1 ; j<=i; j++){
                System.out.print(term);
                term++;
            }
            System.out.println();
        }
    }
}
