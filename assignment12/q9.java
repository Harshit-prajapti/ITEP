// 9. Throws Keyword

// 👉 Write a method readFile(String fileName) that uses FileReader. Declare it with throws IOException and handle it in main().
import java.io.FileReader;
import java.io.IOException;
class Test{
    public static void readFile(String fileName) throws IOException{
        FileReader reader = new FileReader(fileName);
        System.out.print(reader);
    }
    public static void main(String args[]){
        try{
            readFile("check.txt");
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("----------------------------- END -------------------------");
    }
}