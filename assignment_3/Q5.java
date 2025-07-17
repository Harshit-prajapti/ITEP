// 5.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double greater = 0;
        System.out.println("Enter The age of first person");
        double first = sc.nextDouble();
        System.out.println("Enter The age of second person");
        double second = sc.nextDouble();
        System.out.println("Enter The age of third person");
        double third = sc.nextDouble();
        if(first > second && first > third){
            System.out.println( "First Person is older");
            greater = first;
        }
        else if (second > first && second > third){
            System.out.println( "Second Person is older");
            greater = second;
        }
        else if (third > first && third > second){
            System.out.println( "third Person is older");
            greater = third;
        }
        if(first < second && first < third){
            System.out.println( "first Person is younger");
        }
        else if (second < first && second < third){
            System.out.println("Second is younger");
        }
        else if (third < first && third < second){
            System.out.println("Third is younger");
        }


    }
}
