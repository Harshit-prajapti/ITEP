// A
// AB
// ABC
// ABCD
// ABCDE

class Test {
    public static void main(String args[]){
        int print = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(print);
                print++;
            }
            System.out.println();
        }
        }
    }
