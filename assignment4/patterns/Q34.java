
// EEEEE
// DDDD
// CCC
// BB
// A
class Test{
    public static void main(String args[]){
        char term = 'E';
        for(int i = 5; i>=1 ;i--){
            for(int j = 1 ; j<=i; j++){ 
                System.out.print(term);
            }
            term--;
            System.out.println();
        }
    }
}