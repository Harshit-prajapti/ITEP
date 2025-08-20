class Test{
    public static void main(String args[]){
        int arr[] = {2, 3, 4, 5, -1, 0};
        int first = 0; 
        int last = 0;
        int pro  = 1;
        int rowPro = 1;
        for(int i = 0 ;i<arr.length-1;i++){
            rowPro = arr[i];
            for(int j = i+1; j<arr.length;j++){
                rowPro = rowPro * arr[j];
                if(pro < rowPro){
                    pro = rowPro;
                }               
            }
        }
        System.out.print(pro);
    }
}