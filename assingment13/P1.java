// 1 "1 2 3 4 5 6 7 8 9 10"
class Test{
    public static void main(String args[]){
        String s = "1 2 3 4 5 6 7 8 9 10";
        String[] data = s.split(" ");
        int arr[] = new int[data.length];
        int sum = 0;
        for(int i = 0; i<data.length; i++){
            arr[i] =  Integer.parseInt(data[i]);    
            sum += arr[i];        
        }
        System.out.println(sum);
    }
}