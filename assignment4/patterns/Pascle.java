class Test{
    public static void main(String args[]){
        int r = 5;
        int first = 1;
        for(int i =0; i<=r; i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print(" ");
            }
            int value = 1;
            for(int k = 0; k<=i; k++){
                System.out.print(" "+value);
                value = value * (i-k)/(k+1);
            }
            System.out.println();
        }
    }
}