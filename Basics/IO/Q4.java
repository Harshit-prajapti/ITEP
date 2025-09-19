import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
class Test{
    public static void readData(){
        try(FileInputStream fis = new FileInputStream("data.txt");Scanner sc = new Scanner(fis);){
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(Exception e){
            System.out.println("exception caught");
        }
    }
    public static void main(String args[]){
        try(FileOutputStream fos = new FileOutputStream("data.txt")){
            String data = "The study of Nature and natural phinominon is called physics \n physics where we think logically that how things actually work what is \nbehind of their working.";
            byte[] rawData = data.getBytes();
            fos.write(rawData);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        readData();
    }
}