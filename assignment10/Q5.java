// 5) Create an Object having two properties and four behaviours
// (add,substract,multiply,divide) to perform desired operation.object must have setter and getter and keep all
//  properties private.

class Operations{
    private int num1;
    private int num2;
    public void setNumbers(int x, int y){
        num1 = x;
        num2 = y;
    }
    public int getNumber1(){
        return num1;
    }
    public int getNumber2(){
        return num2;
    }

    public int add(){
        return num1 + num2;
    }
    public int substract(){
        return num1-num2;
    }
    public int multiple(){
        return num1*num2;
    }
    public int divide(){
        if(num2 == 0) return 0;
        return num1/num2;
    }
}

class Test{
    public static void main(String args[]){
        Operations op = new Operations();
        op.setNumbers(5,4);
        System.out.println(op.add());
        System.out.println(op.substract());
        System.out.println(op.multiple());
        System.out.println(op.divide());
    }
}
