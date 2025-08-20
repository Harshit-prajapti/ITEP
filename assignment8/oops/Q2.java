// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{
    private String name;
    private String breed;
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void display(){
        System.out.println("Name: "+name+"  Breed: "+breed);
    }
}
class Test{
    public static void main(String args[]){
        Dog d1 = new Dog("Sheru","German Shephard");
        Dog d2 = new Dog("Kaloo", "Labra dog");
        d1.display();
        d2.display();

        d1.setName("Tiger");
        d1.setBreed("Bull dog");
        d2.setName("Don");
        d2.setBreed("Pug");

        d1.display();
        d2.display();
    }
}