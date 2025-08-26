// 17) Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.

class Employee{
    private static int totalSalary = 0;
    private static int count = 0;
    private int empNo = 1;
    private int salary;
    public Employee(int salary){
        count++;
        this.empNo = count;
        this.salary = salary;
        totalSalary += salary;
    }
    public static void display(){
        System.out.printf("Total " + count + " Employee\n" + "Total Salery : "+totalSalary);
    }
}
class Test{
    public static void main(String args[]){
        Employee e = new Employee(5000);
        Employee e1 = new Employee(4000);
        Employee e2 = new Employee(5000);
        Employee e3 = new Employee(5000);
        Employee e4 = new Employee(6000);
        Employee.display();
    }
}