class Test{
    public static void main(String args[]){
        int arr[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,91},
        };
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                if(arr[i][j] %2 == 0){
                    even += arr[i][j];
                }else odd += arr[i][j];
            }
        }
        System.out.println("Even "+even);
        System.out.println("Odd "+odd);
    }
}