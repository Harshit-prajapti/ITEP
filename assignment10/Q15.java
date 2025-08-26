// 15) Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
// two integers
// three float
// all elements of array
// one double and one integer

class MathOperation{
    public int multiple(int x, int y){
        return x * y;
    }
    public float multiple(float x, float y, float z){
        return x*y*z;
    }
    public int multiple(int arr[]){
        int mul = 1;
        for(int i = 0; i<arr.length; i++){
            mul *= arr[i];
        }
        return mul;
    }
    public double multiple(double d, int x){
        return d*x;
    }
}
class Test{
    public static void main(String arg[]){
        MathOperation m = new MathOperation();
        int arr[] = {4,5,6,4,3,4,56,4};
        System.out.println(m.multiple(4,5));
        System.out.println(m.multiple(4.4f,3.4f,5.5f));
        System.out.println(m.multiple(arr));
        System.out.println(m.multiple(4454l,5));
    }
}