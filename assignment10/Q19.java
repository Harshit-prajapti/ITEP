// 19) Make list of Students having name, roll no., age, score.
//  Write a program to accept 10 students record and arrange the Students based on the
//   score group [0-50], [50-65],[65-80],[80-100].
import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private static ArrayList<Student> zeroTo50 = new ArrayList<Student>();
    private static ArrayList<Student> fiftyTo65 = new ArrayList<Student>();
    private static ArrayList<Student> sixfiveTo80 = new ArrayList<Student>();
    private static ArrayList<Student> eightyTo100 = new ArrayList<Student>();
    private String name;
    private int roll;
    private int age;
    private int score;
    public Student(String name,int roll, int age, int score){
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.score = score;
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
    public static void add(Student p){
        if(p.getScore() >= 0 && p.getScore() < 50) zeroTo50.add(p);
        else if(p.getScore() >= 50 && p.getScore() < 65) fiftyTo65.add(p);
        else if(p.getScore() >= 65 && p.getScore() < 80) sixfiveTo80.add(p);
        else eightyTo100.add(p);
    }
    public static void group(){
        System.out.println("***************************************");
        System.out.println("* Zero To 50 : ");
        System.out.println();
        for(Student p : zeroTo50){
            System.out.println(p.getName()+ " - " + p.getScore());
        }
        System.out.println("***************************************");
        System.out.println("* Fifty To 65 : ");
        System.out.println();
        for(Student p : fiftyTo65){
            System.out.println(p.getName()+ " - " + p.getScore());
        }
        System.out.println("***************************************");
        System.out.println("* SixtyFive To 80 : ");
        System.out.println();
        for(Student p : sixfiveTo80){
            System.out.println(p.getName()+ " - " + p.getScore());
        }
        System.out.println("***************************************");
        System.out.println("* Eighty To 100 : ");
        System.out.println();
        for(Student p : eightyTo100){
            System.out.println(p.getName()+ " - " + p.getScore());
        }
    }
    
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean flage = true;
        while(flage){
            String name;
            int roll,age,score;
            System.out.print("Enter the Name of Studnet : ");
            name = sc.nextLine();
            System.out.print("Enter the Roll Number : ");
            roll = sc.nextInt();
            System.out.print("Enter the age of the student : ");
            age = sc.nextInt();
            System.out.print("Enter the scroe of the studnet : ");
            score = sc.nextInt();
            Student obj = new Student(name,roll,age,score);
            Student.add(obj);
            System.out.println("Are you wnat to add more records false/true");
            boolean check = sc.nextBoolean();
            sc.nextLine();
            flage = check;
        }
        // Student s = new Student("Harshit",1,21,60);
        // Student s1 = new Student("Devraj",2,22,40);
        // Student s2 = new Student("Ankit",3,21,95);
        // Student s3 = new Student("khushi_ji",4,10,100);
        // Student s4 = new Student("anisha",5,25,17);
        // Student s5 = new Student("sourabh ",6,21,80);
        // Student s6 = new Student("Shivam",7,22,150);
        // Student s9 = new Student("Abhay",8,21,76);
        // Student s7 = new Student("Alfhesh",9,22,20);
        // Student.add(s);
        // Student.add(s1);
        // Student.add(s2);
        // Student.add(s3);
        // Student.add(s4);
        // Student.add(s6);
        // Student.add(s5);
        // Student.add(s7);
        // Student.add(s9);
        Student.group();
        
    }
}

// class Student {
//     private String name;
//     private int roll;
//     private int age;
//     private int score;
//     public Student(String name,int roll, int age, int score){
//         this.name = name;
//         this.roll = roll;
//         this.age = age;
//         this.scroe = score;
//     }
//     public int getScore(){
//         return score;
//     }
//     public String getName(){
//         return name;
//     }
// }
// class Test{
//     public static Student s[] = new Student[4];
//     ArrayList<Student> zeroTo50 = new ArrayList<Student>();
//     ArrayList<Student> fiftyTo65 = new ArrayList<Student>();
//     ArrayList<Student> sixfiveTo80 = new ArrayList<Student>();
//     ArrayList<Student> eightyTo100 = new ArrayList<Student>();
//     public static void group(){
//         for(Product p : s){
//             if(p.getScore() >= 0 && p.getScore() < 50) zeroTo50.add(p);
//             else if(p.getScore() >= 50 && p.getScore() < 65) fiftyTo65.add(p);
//             else if(p.getScore() >= 65 && p.getScore() < 80) sixfiveTo80.add(p);
//             else eightyTo100.add(p);
//         }
//         System.out.println("Zero To 50 : ");
//         for(Product p : zeroTo50){
//             System.out.print(p.getName()+ " - " + p.getScore());
//         }
//         System.out.println("Zero To 50 : ");
//         for(Product p : fiftyTo65){
//             System.out.print(p.getName()+ " - " + p.getScore());
//         }
//         System.out.println("Zero To 50 : ");
//         for(Product p : sixfiveTo80){
//             System.out.print(p.getName()+ " - " + p.getScore());
//         }
//         System.out.println("Zero To 50 : ");
//         for(Product p : eightyTo100){
//             System.out.print(p.getName()+ " - " + p.getScore());
//         }
//     }
//     public static void main(String args[]){
//         Student s = new Student("Harshit",1,20,20);
//         this.s.add(s);
//         Student s2 = new Student("Ankit",2,21,50);
//         this.s.add(s2);
//         Student s3 = new Student("Devraj",3,20,80);
//         this.s.add(s3);
//         Student s4 = new Student("Anish",4,21,90);
//         this.s.add(s4);
//         group();
//     }
// }