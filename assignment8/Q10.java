class AreaCalculator{
    private float length;
    private float width;
    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public void display(){
        System.out.println(length*width);
    }
}
class Test{
    public static void main(String args[]){
        AreaCalculator a = new AreaCalculator();
        a.setLength(10.1f);
        a.setWidth(99.9f);
        a.display();
    }
}