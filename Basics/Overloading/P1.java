class Check{
    public int sum(int x, int y){
        return  x+y;
    }
    public float sum(float x, float y){
        return x+y;
    }
    // public void print(short x, short y){
    //     System.out.println("method for short called");
    //     System.out.println(x+y);
    // } 
    public void print(int x, int y){
        System.out.println(x+y);
    }
}
class Test{
    public static void main(String args[]){
        Check c =new Check();
        System.out.println(c.sum(5,5));
        System.out.println(c.sum(5.5f,4.6f));
        c.print((short)5,(short)6);
    }
}