// 14) Create a class MathOperation with two data member X and Y to store the operand and third data member
//  R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R
import java.util.Scanner;
class MathOperation{
    private int x;
    private int y;
    private int result;
    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of x : ");
        this.x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        this.y = sc.nextInt();
    }
    public void add(){
        this.result = x + y;
    }
    public void multiple(){
        this.result = x * y;
    }
    public void power(){
        int pow = 1;
        for(int i = 0; i<y; i++){
            pow *= x;
        }
        this.result = pow;
    }
    public int display(){
        return result;
    }
}
class Test{
    public static void main(String args[]){
        MathOperation m = new MathOperation();
        m.init();
        m.add();
        System.out.println(m.display());
        m.power();
        System.out.println(m.display());
    }
}