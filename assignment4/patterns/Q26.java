// A
// AB
// ABC
// ABCD
// ABCDE

class Test {
    public static void main(String args[]){
        // for(int i = 1 ; i<= 5; i++){
        //     int c = 96;
        //     for(int j = 0; j < i; j++){
        //         c = c + j;
        //         System.out.print((char)c + " ");
        //     }
        //     System.out.println();
        for(int i=1;i<=5;i++){
            char a='a';
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
            
        }
        }
    }
