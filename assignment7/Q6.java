class Test{
    public static void main(String args[]){
        int arr[][] = {
            {10,20,3000},
            {40,50,600},
            {70,80,91},
        };
        int higher = 0;
        int row = 0;
        
        for(int i = 0 ; i<arr.length; i++){
            int rowSum = 0;            
            for(int j = 0 ; j<arr[i].length ; j++){
                rowSum = rowSum + arr[i][j];
            }
            if(rowSum > higher){
                higher = rowSum;
                row = i;
            };
        }
        System.out.println(row);
        for(int i = 0; i<arr[row].length ; i++){
            System.out.print(arr[row][i] + " ");
        }
    }
}