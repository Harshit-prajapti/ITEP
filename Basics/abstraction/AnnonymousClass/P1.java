interface I{
    int add(int x, int y);
    int mult(int x, int y);
}
class Test{
    public static void main(String args[]){
        I obj = new I(){
            public int add(int x, int y){
                return x+y;
            }
            public int mult(int x, int y){
                return x * y;
            }
        };
        System.out.println(obj.add(4,5));
        // System.out.println(obj2.mult(5,4));
    }
}