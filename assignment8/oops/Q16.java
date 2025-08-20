class Shape{
    class Rectange{
        float length;
        float width;
        public Rectange(float length, float width){
            this.length = length;
            this.width = width;
        }
        public float area(){
            return length*width;
        }
        public float peri(){
            return 2*(length + width);
        }
    }
    class Circle{
        float radious;
        public Rectange(float radious){
            this.radious = radious;
        }
        public float area(){
            return 3.14*radious*radious;
        }
        public float peri(){
            return 2*3.14*radious;
        }
    }
}
class Test{
    public static void main(String args[]){
        Shape s = new Shape();
    }
}