// We need abstract classes in Java when we want to create a common base with partial implementation,
//  prevent instantiation of incomplete objects, and force subclasses to define specific behaviors.
abstract class Animal {
    public void eat(){
        System.out.println("Eating...");
    }
    abstract public void makeSound();
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("wof wof");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Me aau");
    }
}
class Test{
    public static void main(String args[]){
        Dog d = new Dog();
        d.eat();
        d.makeSound();
    }
}
