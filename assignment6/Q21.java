class Test{
    public static void main(String args[]){
        int arr[] = {8,3,1,2};
        int rowPro = 1;
        int pro = 1;
        for(int i = 0 ;i<arr.length; i++){
            for(int j = 0 ; j<arr.length-1 ; j++){
                rowPro = arr[0];
                int temp = arr[j];
                arr[j] = arr[j+1];
                
            }
        }
    }
}