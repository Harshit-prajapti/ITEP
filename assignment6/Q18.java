class Test{
    public static void main(String args[]){
        int arr[] = {1,2,3,-2,5};
        int rowsum = 0;
        int sum = 0;
        for(int i = 0 ;i<arr.length-1 ;i++){
            rowsum = arr[i];
            for(int j = i+1; j<arr.length ; j++){
                rowsum = rowsum + arr[j];
                if(sum < rowsum){
                    sum = rowsum;
                }
            }
        }
        System.out.print(sum);
    }
}