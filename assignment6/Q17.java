class Test {
    public static void main(String arg[]){
        int sum = 0;
        boolean flage = false;
        int arr[] = {4,-1,-3,1,6};
        int i;
        for(i = 0; i<arr.length-1; i++){
            sum = arr[i];
            for(int j = i+1; j<arr.length; j++){
                if(sum == 0){
                    flage = true;
                    break;
                }
                sum = sum + arr[j];
            }
            if(flage) break;
        }
        if(i!=arr.length-1){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}