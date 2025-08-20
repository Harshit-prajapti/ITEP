// 55555
// 4  4
// 3 3
// 22
// 1
class Test{
    public static void main(String args[]){
        for(int i = 5; i>=1; i--){
            for(int j = i; j>= 1; j--){
                if(i == 5 || i == j || j == 1){
                    System.out.print(i);
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}