class Employee {
    private int id ;
    private String name;
    private float salary; 
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public void display(){
        System.out.printf("Name : "+name+"\nId : "+id+"\nsalary : "+salary);
    }
}
class Test {
    public static void main(String args[]){
        Employee e = new Employee();
        e.setId(0001);
        e.setName("Harshit Kumbhkar");
        e.setSalary(10000.45f);
        e.display();
    }
}