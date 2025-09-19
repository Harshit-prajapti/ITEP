import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
class Text{
    public static void printObjects() throws Exception{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myText2.txt"))) {
            while (true) {
                try {
                    SingleTune obj = (SingleTune) ois.readObject();
                    System.out.println("Read: " + obj.getName());
                } catch (EOFException e) {
                    System.out.println("Reached end of file.");
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String agrs[]){
       try{
        printObjects();
       }catch(Exception e){
        System.out.println("---------");
       }
    }
}