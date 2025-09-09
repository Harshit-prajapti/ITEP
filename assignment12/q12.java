// 2. File Upload System
// A web app allows file upload. But the file path provided by the user does not exist.
// Which Java exception will occur?
// How would you handle it so the program doesn’t crash?
// Should you retry or show a friendly message to the user?
import java.io.File;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileNotFoundException;
class Upload{
    ArrayList<String> list = new ArrayList<String>();
    public void uploadFile(String path) throws FileNotFoundException{
        File file = new File(path);
        FileReader reader = new FileReader(file);
        System.out.print(reader);
        list.add(path);
    }
}
class Test{
    public static void main(String args[]){
        Upload up = new Upload();
        try{
            up.uploadFile("myTes.txt");
        }catch(FileNotFoundException e){
            System.out.println("Please enter a valid file path ");
        }
        
    }
}