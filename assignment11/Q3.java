import java.util.Scanner;
interface BonusEligible {
    public void giveBonus();
}
abstract class Employee{
    private int id;
    private String name;
    private int salery;
    public Employee(int id, String name, int salery){
        this.id = id;
        this.name = name;
        this.salery = salery;
    }
    abstract public void calculateSalary();
    public void showDetails(){
        System.out.println("Id : "+id+" Name : "+name+" Salery : "+salery);
    }
    public int getSalery(){
        return salery;
    }
}
class FullTimeEmployee extends Employee implements BonusEligible{
    private int bouns;
    public FullTimeEmployee(int id, String name,int salery){
        super(id,name,salery);
        giveBonus();
    }
    public void giveBonus(){
        System.out.println("Are you wants to give him a bonus : true/false");
        Scanner sc = new Scanner(System.in);
        boolean flage = sc.nextBoolean();
        if(flage){
            System.out.println("Enter the amount of bouns : ");
            int bouns = sc.nextInt();
            this.bouns = bouns;
        }
    }
    public void calculateSalary(){
        System.out.println("Salery : "+getSalery()+" + Bonus : "+this.bouns+" = "+(getSalery()+this.bouns));
    }
}
class PartTimeEmployee extends Employee implements BonusEligible{
    private int bouns;
    private float hours;
    public PartTimeEmployee(int id, String name,int salery){
        super(id,name,salery);
        hours();
        giveBonus();
    }
    Scanner sc = new Scanner(System.in);
        
    public void hours(){
        System.out.println("Enter the working hours of Part time employee : ");
        float hours = sc.nextFloat();
        this.hours = hours;
    }
    public void giveBonus(){
        System.out.println("Are you wants to give him a bonus : true/false");
        
        boolean flage = sc.nextBoolean();
        if(flage){
            System.out.println("Enter the amount of bouns : ");
            int bouns = sc.nextInt();
            this.bouns = bouns;
        }
    }
    public void calculateSalary(){
        System.out.println("Salery : "+getSalery()+ " * Hours : "+this.hours+" + Bonus : "+this.bouns+" = "+((getSalery()*hours)+(this.bouns)));
    }
}
class Intern extends Employee{
    public Intern(int id, String name,int salery){
        super(id,name,salery);
    }
    public void calculateSalary(){
        System.out.println("Stephen");
    }
}
class Test{
    public static void main(String args[]){
        FullTimeEmployee e1 = new FullTimeEmployee(1,"Harshit",100000);
        e1.showDetails();
        e1.calculateSalary();
        PartTimeEmployee e2 = new PartTimeEmployee(2,"Harshit",2000);
        e2.showDetails();
        e2.calculateSalary();
    }
}