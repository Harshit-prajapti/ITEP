class Test {
    public static void main(String args[]){
        int arr[] = {4,53,5,6,4,6,3,5,6,7};
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i + 1; j<arr.length ; j++ ){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}