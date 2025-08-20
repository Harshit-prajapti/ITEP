class Test {
    public static void main(String args[]){
        int i = 1;
        while (i<=10) {
            // if(i == 10){
            //     System.out.println();
            // }
            int j = 1;
            while (j<=10) {
                if(i == 1 || i == 10){
                    System.out.print("_");
                }
                else if (j == 1|| j== 10){
                    System.out.print("|");
                }
                else if (j == i){
                    System.out.print("\\");
                }
                else if((11-i)==j){
                     System.out.print("/");
                }
                else {
                    System.out.print(" ");
                }
            j++;
            }
            System.out.println();
            i++;
        }
    }
}
