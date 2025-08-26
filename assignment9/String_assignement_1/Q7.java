class MyMthods{
    public String removeDublicate(String s){
        String result = new String();
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length;i++){
            boolean flage = true;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    flage = false;
                    break;
                }
            }
            if(flage) result += arr[i];
        }
        return result;   
    }
}
class Test{
    public static void main(String args[]){
        MyMthods m1 = new MyMthods();
        System.out.println(m1.removeDublicate("aabbccddd"));
    }
}