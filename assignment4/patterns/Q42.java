// A
// BCD
// EFGHI
// JKLMNOP


class Test{
    public static void main(String args[]){
        char a = 'A';
        for(int i = 1; i<= 8; i = i+2){
            for(int j = 1 ; j<=i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}