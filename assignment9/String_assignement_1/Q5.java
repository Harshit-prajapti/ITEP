class MyMthods{
    public String reverse(String s){
        String result = new String();
        int found = 0;
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i) == ' ' || i == s.length()-1){
                for(int j = i; j>=found ; j--){
                    result += s.charAt(j);
                }
                result += ' ';
                found = i;
            }
        }
        return result;
    }
}
class Test{
    public static void main(String args[]){
        MyMthods m1 = new MyMthods();
        String result = m1.reverse("Java is very Easy");
        System.out.println(result);
    }
}