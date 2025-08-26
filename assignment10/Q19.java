// 19) Make list of Students having name, roll no., age, score.
//  Write a program to accept 10 students record and arrange the Students based on the
//   score group [0-50], [50-65],[65-80],[80-100].

class Student {
    private String name;
    private int roll;
    private int age;
    private int score;
    public Student(String name,int roll, int age, int score){
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.scroe = score;
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
}
class Test{
    Student s[] = new Student[4];
    public static void group(){
        ArrayList<Student> zeroTo50 = new ArrayList<Student>();
        ArrayList<Student> fiftyTo65 = new ArrayList<Student>();
        ArrayList<Student> sixfiveTo80 = new ArrayList<Student>();
        ArrayList<Student> eightyTo100 = new ArrayList<Student>();
        for(Product p : s){
            if(p.getScore() >= 0 && p.getScore() < 50) zeroTo50.add(p);
            else if(p.getScore() >= 50 && p.getScore() < 65) fiftyTo65.add(p);
            else if(p.getScore() >= 65 && p.getScore() < 80) sixfiveTo80.add(p);
            else eightyTo100.add(p);
        }
        for(int i = 0; i<)
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<s.length(); i++){
            String name;
            int roll,age,score;
            System.out.printf("Enter the name of the student : ");
            name = sc.nextLine();
            System.out.printf("Enter the roll of the student : ");
            roll = sc.nextInt();
            System.out.printf("Enter the age of the student : ");
            age = sc.nextInt();
            System.out.printf("Enter the score of the student : ");
            score = sc.nextInt();
            Studnet obj = new Student(name,roll,age,score);
            s[i] = obj;
        }
        for(int i = 0; i<s.length(); i++){

        }
    }
}