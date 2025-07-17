// 27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: 
// Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// Basic Salary <= 20000 : HRA = 25%, DA = 90% 
// Basic Salary > 20000 : HRA = 30%, DA = 95% 

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        double salary = sc.nextDouble();
        double hra = 0, da = 0;
        if(salary <= 10000){
            hra = salary * 20.0/100;
            da = salary * 80.0/100;
        }
        else if(salary <= 20000){
            hra = salary * 25.0/100;
            da = salary * 90.0/100;
        }
        else if(salary > 20000){
            hra = salary * 30.0/100;
            da = salary * 95.0/100;
        }

        System.out.println("HRA = "+ hra);
        System.out.println("DA = "+ da);

        double grossSalary = salary + hra + da;
        System.out.println("Gross Salary = "+ grossSalary);
       
    }
}