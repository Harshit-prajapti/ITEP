// 8. Checked vs Unchecked Exception

// 👉 Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked).
//  Show the difference in compiler behavior.
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
class Operations{
    public void readFile() throws IOException {
        FileReader reader = new FileReader("not-existing.txt");
        // String line;
        //     while ((line = reader.readLine()) != null) {
        //         System.out.println(line);
        //     }
        //     reader.close();
        System.out.println(reader);
    }
    public void div() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int num,den;
            System.out.print("Enter the numerator : ");
            num = sc.nextInt();
            System.out.print("Enter the denominator : ");
            den = sc.nextInt();
            System.out.println("Result of divison is : "+num/den);
    }
}
class Test{
    public static void main(String args[]){
        Operations op = new Operations();
        try{
            op.readFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        // Here i must have to write the try-catch block because the readFile method may be throw IOException that is 
        // checked exception 
        op.div();
        // and div may be throw unchecked exception so we not have to right specific try catch block for this 
        System.out.println("---------------------- End -----------------------");
        
    }
}

