interface Flyable {
    void fly();
}
abstract class Animal{
    private String name;
    private int age;
    abstract void eat();
    abstract void makeSound();
    public void showInfo(){
        System.out.println(name + " : "+age);
    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }   
}
class Lion extends Animal{
    public Lion(String name, int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("Eat meat...");
    }
    public void makeSound(){
        System.out.println("Rore Rore...");
    }
}
class Elephant extends Animal{
    public Elephant(String name, int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("Eat lifes...");
    }
    public void makeSound(){
        System.out.println("i don't know...");
    }
}
class Parrot extends Animal implements Flyable{
    public Parrot(String name, int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("eat chili...");
    }
    public void makeSound(){
        System.out.println("chee chee...");
    }
    public void fly(){
        System.out.println("flying...");
    }
}
class Test{
    public static void main(String args[]){
        Lion l = new Lion("Mufaasa",20);
        l.showInfo();
        l.eat();
        l.makeSound();
        Elephant e = new Elephant("Gajni",80);
        e.showInfo();
        e.eat();
        e.makeSound();
        Parrot p = new Parrot("chiki",5);
        p.showInfo();
        p.eat();
        p.makeSound();
        p.fly();
    }
}