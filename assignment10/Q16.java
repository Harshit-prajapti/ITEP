// 16) Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
// Method to display name and age of person.

class Person{
    private String name;
    private int age = 18;
    public void init(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.printf(name+" : "+age);
    }
}
class Test{
    public static void main(String args[]){
        Person p = new Person();
        p.init("Harshit",20);
        p.display();
    }
}