import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class SingleTune implements Serializable {
    private String name;
    private int age;
    private String address;
    private static SingleTune ref = null;
    private SingleTune(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    };
    public static SingleTune getObject(String name, int age, String address){
        if(ref != null) return ref;
        ref = new SingleTune(name,age,address);
        return ref;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

}
public class Q2 {
    public static void main(String[] args) {
        SingleTune obj = SingleTune.getObject("Subham",20,"Village-Makodi");
        try(FileOutputStream fos = new FileOutputStream("myText2.txt",true);ObjectOutputStream oos = new ObjectOutputStream(fos);){   
            for(int i = 0; i<3; i++)         
            oos.writeObject(obj);
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
}