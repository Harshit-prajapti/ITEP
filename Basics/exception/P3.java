interface superInterface {
    void goodAfternoon();
}
interface myInterface extends superInterface{
    int y = 7;
    default void greed(){
        System.out.println("Greed from myInterface");
    }
    void goodEvening();
}
class MyException implements myInterface{
    public int divisionByZero(int n) throws RuntimeException{
        return n/0;
    }
    public void goodEvening(){
        System.out.println("Good evening method called");
    }
    public void goodAfternoon(){
        System.out.println("Good Afternoon");
    }
}
class Test{
    public static void main(String args[]){
        MyException my = new MyException();
        try{
            my.divisionByZero(5);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        my.goodEvening();
        
    }
}