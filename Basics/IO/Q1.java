import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
public class Q1 {
    public static void main(String[] args) {
        File f = new File("myText.txt");
        if(f.exists()){
            
            System.out.println("File exists");
            try{
            FileOutputStream fout = new FileOutputStream(f);
            String s = "Io is very very simple\n Io are used to perform input output operations from console file";
            byte data[] = s.getBytes();
            fout.write(data);            
            while(true){
                FileInputStream fin = new FileInputStream(f);
                int w = fin.read();
                if(w == -1) break;
                System.out.print((char)w);
            }
            
            }catch(IOException e){
                e.printStackTrace();
            }
        } else {
            try {
                f.createNewFile();
                System.out.println("File created");
            } catch (IOException e) {
                System.out.println("Error creating file");
            }
        }
    }
}