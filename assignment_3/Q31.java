import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char choice;
        double temperature;
        System.out.println("Enter 'C' or 'c' to convert Fahrenheit to Celsius.");
        System.out.println("Enter 'F' or 'f' to convert Celsius to Fahrenheit.");
        System.out.print("Enter your choice: ");

        choice = sc.next().charAt(0);
        
        switch (choice) {
            case 'c':              
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = sc.nextDouble();
                    double celsius = (temperature - 32) * 5 / 9;
                    System.out.println(temperature+"Fahrenheit is " + celsius+" Celsius");
                break; 
            case 'C': 
             
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = sc.nextDouble();
                    double celsius2 = (temperature - 32) * 5 / 9;
                    System.out.println(temperature+"Fahrenheit is " + celsius2+" Celsius");
                break; 

            case 'f': 
                
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = sc.nextDouble();
                    double fahrenheit = (temperature * 9 / 5) + 32;
                    System.out.println(temperature+" Celsius is " + fahrenheit + "Fahrenheit");
                break; 
            case 'F': 
                
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = sc.nextDouble();
                    double fahrenheit2 = (temperature * 9 / 5) + 32;
                    System.out.println(temperature+" Celsius is " + fahrenheit2 + "Fahrenheit");
                break; 
            default: 
                System.out.println("Please enter 'C', 'c', 'F', or 'f'.");
                break;
        }

    }
}