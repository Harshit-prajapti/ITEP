// Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
class Rectangle{
    private float width;
    private float height;

public void setValue(float width, float height){
    this.width = width;
    this.height = height;
}
public void Area(){
    float area = this.width * this.height;
    System.out.println(area);
}
public void Perimeter(){
    float perimeter = 2*(this.width + this.height);
    System.out.println(perimeter);
}
}
class Test{
    public static void main(String args[]){
    Rectangle r = new Rectangle();
    r.setValue(32.2f, 4.1f);
    r.Area();
    r.Perimeter();
    }
}