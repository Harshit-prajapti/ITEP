// *****
// ####
// ***
// ##
// *

class Test{
    public static void main(String args[]){
        for(int i = 5; i>=1; i--){
            for(int j = i; j>= 1; j--){
                if(i%2==0){
                    System.out.print("#");
                    continue;
                } 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}