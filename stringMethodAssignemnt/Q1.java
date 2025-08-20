import java.util.Scanner;
class MyMethos{
    private String myString; 
    public MyMethos(String myString){
        this.myString = myString;
    }
     public char myCharAt(int index){
        byte myBytes[] = myString.getBytes();
        return (char)myBytes[index];
     }
     public String myUpperCase(){
            String s = new String();
            for(int i = 0; i<myString.length(); i++){
                int ch = (int)myString.charAt(i);
                if(ch >=  97 && ch <= 122){
                    ch = ch -32;
                }
                char c = (char)ch;
                s = s + c;
            }
            return s;       

     }
     public String myLowerCase(){
        String s = new String();
        for(int i = 0 ; i<myString.length(); i++){
            int ch = (int)myString.charAt(i);
            if(ch >= 65 && ch < 90){
                ch = ch + 32;
            }
            char c = (char)ch;
            s = s + c;
        }
        return s;
     }
     public int myLength(){
        char arr[] = myString.toCharArray();
        return arr.length;
     } 
     public String myTrim(){
        String s = new String();
        int length = myLength()-1;
        int last = length;
        int firstFound = -1;
        for(int i = 0; i<myLength(); i++){
            if(myCharAt(i) != ' ') firstFound = i;
            if(myCharAt(length-i) != ' ') last = length-1;
            else last--; 
            if(firstFound != -1 && i<=last) s+= myCharAt(i);
        }        
        return s;
     }
     public boolean myEquals(String second){
        if(myLength() != second.length()) return false;
        for(int i = 0 ; i < myLength(); i++){
            if(myCharAt(i) != 
            second.charAt(i)) return false;
        }
        return true;
     }       
     public int myCompair(String second){
        if(myLength() > second.length()) return 1;
        if(myLength() < second.length()) return -1;
        if(myLength() == second.length()){
            for(int i = 0; i<myLength() ; i++){
                if(myCharAt(i) != second.charAt(i)){
                    return ((int)myCharAt(i)) - ((int)second.charAt(i));
                }
            }
        }
        return 0;
     } 
     public boolean myContains(String second){
        if(second.length() > myLength()) return false;
        for(int i = 0; i<myLength() ; i++){
            if(myCharAt(i) == second.charAt(0)){
                int init = 0;
                for(int j = i ; j < second.length(); j++){
                    if(myCharAt(j) != second.charAt(init)) return false;
                    init++;
                }
            }
        }
        return true;
     } 
    //  public String replace(String replace, String replaceBy){
    //     String s = new String();
    //     if(myLength(replace) == 1 && myLength(replaceBy) == 1){
    //         char ch = myCharAt(0,replace);
    //         for(int i = 0 ; i<myLength(myString); i++){
    //             if(myCharAt(i,myString) == ch) s+= replaceBy;
    //             else s+= myCharAt(i,myString);
    //         }
    //         return s;
    //     }
    //     return s;
    //  }
}
class Test{
    public static void main(String args[]){        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name : ");
        String input = sc.nextLine();
        MyMethos obj = new MyMethos(input);
        System.out.println(obj.myCharAt(2));
        System.out.println("This is the uppercase version of input : "+obj.myUpperCase());
        System.out.println("This is the lower case of input : "+obj.myLowerCase());
        System.out.println("Result after trim : ");
        String result = (obj.myTrim());
        System.out.println("$"+result+"$");
        System.out.println("This is the char at position 3 is : "+(obj.myCharAt(3)));
        System.out.println("Comapirsion of "+input+" and Harshit is : " + (obj.myEquals("Harshit")));
        System.out.println("The length of Entered String is : "+(obj.myLength()));
        System.out.println("Comparision of Harshit and Harshit is : "+(obj.myCompair("Harshit")));
        System.out.println("Contain Operatrion between Harshit and Harsh is : "+(obj.myContains("rshit")));
        // System.out.println("Replacement of o to x in Hello World String is "+(obj.replace("Hello World","o","x")));
    }
}
