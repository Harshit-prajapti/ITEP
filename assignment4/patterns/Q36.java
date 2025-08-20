// ABCDE
// A  D
// A C
// AB
// A

class Test{
    public static void main(String args[]){
        for(int i = 5; i>=1 ;i--){
            char term = 'A';
            for(int j = 1 ; j<=i; j++){ 
                if(i == 5 || j == 1 || j==i)
                System.out.print(term);
                else System.out.print(" ");
                term++;
            }
            System.out.println();
        }
    }
}
