import java.util.LinkedHashSet;
class MyMthods{
    public boolean isPalindrome(String s){
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }public LinkedHashSet<String> allPossiblePlaindrome(String s){
        LinkedHashSet<String> l1 = new LinkedHashSet<String>();
        for(int i = 0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                String sub = s.substring(i,j);
                if(isPalindrome(sub)){
                    l1.add(sub);
                }
            }
        }
        return l1;
    }
}
class Test{
    public static void main(String args[]){
        MyMthods m1 = new MyMthods();
        System.out.println(m1.isPalindrome("HelleH"));
        System.out.println(m1.allPossiblePlaindrome("aaabbbacccababacccaabb"));
    }
}