
class Consummer {
    synchronized public boolean consume(){
        for(int i = 0; i<4; i++){
            System.out.println("Consumming")
            try{Thread.sleep(100)}catch(InterruptedException e){};
        }
        return true;
    }
    public void active(Producter obj){
        System.out.println("I was activated");
        Thread.wait();
        if(obj.produce()){
            Thread.notify();
            consume();
        }
    }
}
class Producter{
    synchronized public boolean produce(){
        for(int i = 0; i<4; i++){
            System.out.println("Producing");
        }
        return true;
    }
}
class First extends Thread{
    public First(Consummer obj){
        if(obj.consume()){

        }
    }
}
class Second extends Thread{
    private Producter pobj;
    public Second(Producter obj){
        this.pobj = obj;
    }

}