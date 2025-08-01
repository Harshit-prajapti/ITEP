class Test {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,6,7};
        int first = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(i == arr.length-1) {
                arr[i] = first ;
                break;
            }
            arr[i] = arr[i+1];
        }
        for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
    }
    
}