
interface CertificateProvider {
    public void generateCertificate();
}
abstract class Course{
    private String title;
    private float duration;
    public Course(String title, float duration){
        this.title = title;
        this.duration = duration;
    }
    abstract public void startCourse();
    abstract public void endCourse();
    public void cousrDetails(){
        System.out.println("Title is : "+title+" duration is : "+duration);
    }
}
class VideoCourse extends Course implements CertificateProvider{
    public VideoCourse(String title, float duration){
        super(title, duration);
    }
    public void startCourse(){
        System.out.println("Video Course Sarting...");
    }
    public void endCourse(){
        System.out.println("Video Cousr ending");
    }
    public void generateCertificate(){
        System.out.println("You done the Video Course");
    }
}
class LiveCourse extends Course{
    public LiveCourse(String title, float duration){
        super(title, duration);
    }
    public void startCourse(){
        System.out.println("Video Course Sarting...");
    }
    public void endCourse(){
        System.out.println("Video Cousr ending");
    }
}
class Test{
    public static void main(String args[]){
        VideoCourse c1 = new VideoCourse("Neet",10);
        c1.cousrDetails();
        c1.startCourse();
        c1.endCourse();
        c1.generateCertificate();
        LiveCourse c2 = new LiveCourse("Jee",26);
        c2.cousrDetails();
        c2.startCourse();
        c2.endCourse();
    }
}