class ExceptionHandle extends Exception{
        public ExceptionHandle(String message){
            super(message);
        }
}
class Ex{    
    public int div() throws ExceptionHandle{
            System.out.println("try");
            throw new ExceptionHandle("Divison by zero not allowed");
    }
}
class Test{
    public static void main (String arge[]){
        Ex e = new Ex();
        System.out.println(e.div());
    }
}