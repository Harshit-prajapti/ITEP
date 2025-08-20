class Geometry{
    private float r;
    public void setReadious(float r){
        this.r = r;
    }
    public void display(){
        System.out.println(r*r*3.14);
    }
}
class Test{
    public static void main(String arg[]){
        Geometry g = new Geometry();
        g.setReadious(4.5f);
        g.display();
    }
}