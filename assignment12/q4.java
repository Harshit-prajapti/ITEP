// 4. NullPointerException

// 👉 Declare a String = null. Try to call length() on it. Handle the exception.

// // Expected
// java.lang.NullPointerException caught
class Test{
    public static void main(String args[]){
        String s = null;
        try{
            s.length();
        }catch(NullPointerException e){
            System.out.println("java.lang.NullPointerException caught");
        }
    }
}