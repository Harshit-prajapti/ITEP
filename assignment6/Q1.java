class Test{
    public static void main(String arg[]){
        int arr[]  = {4,5,3,4,6,3,6,54,3,5,6,66,7};
        int temp = 0;
        for(int i = 0 ; i<arr.length-1 ;i++){
            for(int j = 1; j<arr.length ; j++){
                // if(arr[i] == arr[j]){
                //     temp = arr[j];
                //     arr[j] = arr[i+1];
                //     arr[i+1] = temp;
                //     // continue;
                // }
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;  
                }
            }
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}