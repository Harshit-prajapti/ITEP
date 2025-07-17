import java.util.Scanner;

public class Q11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        System.out.println("Enter you sex M for male and F for woman: ");
        String ageInput = sc.next();
        char sex = (char)ageInput.charAt(0);
        System.out.println("Enter your martial status Y for yes and N for no : ");
        char martial = (char)sc.next().charAt(0);
        if(sex == 'F'){
            System.out.println("You will work only in uran areas");
        }
        else if (sex == 'M' && age>=20 && age<=40){
            System.out.println("You may work in anyware");
        }   
        else if (sex == 'M' && age>=40 && age<=60){
            System.out.println("You will work in urban area only");
        }else {
            System.out.println("ERROR");
        }
    }
}
