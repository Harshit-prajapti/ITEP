class Test{
    public static void main(String args[]){
        String s = "Harshit";
        String s1 = "Harshit";
        System.out.println(s == s1); // true
        String s2 = new String("Harshit");
        System.out.println(s == s2); //false
        System.out.println(s.equals(s2)); // true
        System.out.println("Harshit".length());
    }
}