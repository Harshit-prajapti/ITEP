class Test {
    public static void main(String arg[]){
        int arr[] = {1,9,3,10,4,20,2};
        int largest = 1;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length ; j++){
                if(largest + 1 == arr[j]) largest = arr[j];
            }
        }
        System.out.print(largest);
    }
}