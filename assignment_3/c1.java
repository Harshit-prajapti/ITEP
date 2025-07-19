import java.util.Scanner;
class c1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in)
        System.out.println("CHECK VOWEL AND CONSONENT");

        char ch=sc.next().charAt(0);

        switch(ch){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':System.out.println("Vowell")
            default:System.out.println("Consonent");
        }
    }
}
