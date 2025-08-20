// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    } 
    public void display(){
        System.out.println("Name: "+name+ "Age: " +age);
    }
}
class Test{
    public static void main(String args[]){
     Person p1 = new Person("Ram ", 21);
     Person p2 = new Person("Shyam ", 22);
     p1.display();
     p2.display(); 
    }
}