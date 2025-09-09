// 3. ArrayIndexOutOfBoundsException

// 👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caught
import java.util.Scanner;
class Check{
    public void getElement(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the "+(i+1)+"th Element : ");
             arr[i]= sc.nextInt();
        }
        
        System.out.print("Enter the index to print the element : ");
        int i = sc.nextInt();
        try{
            System.out.println("Element at "+i+"th index is "+arr[i]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException caught");
        }
    }
}
class Test{
    public static void main(String args[]){
        Check c = new Check();
        c.getElement();
        System.out.print("--------------------- End --------------------");
    }
}