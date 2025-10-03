import java.util.ArrayList;
class Test{
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        ArrayList al2 = new ArrayList<>(); // non generic ArrayList
        al.add("Harshit");
        al.add("Aman");        
        al2.add(4);
        al2.add(8);
        System.out.println(al2.get(0));
        al.addAll(al2);
        System.out.println(al);
        System.out.println(al);
        System.out.println(al.remove(new Integer(7))); // returns true if element is found and removed else false
        System.out.println("After remove Intital array List is : "+al);
        al.removeAll(al2);
        System.out.println("After remove al2 Intital array List is : "+al);
    }
}