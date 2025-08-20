import java.util.Scanner;
class Another{
    int size;
    int arr[];
    Scanner sc = new Scanner(System.in);
    public void setData(){        
        System.out.print("Enter the size of array : ");
        this.size = this.sc.nextInt();
        arr = new int[size];
        for(int i = 0 ; i<size ; i++){
            System.out.println("Enter the "+(i+1)+"th Elemetn of array : ");
            arr[i] = this.sc.nextInt();
        }
    }
    public void printData(){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void find(){
        System.out.println();
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int larger = arr[0];
        int greater = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < num && arr[i] > )
        }
    }
}
class Test{
    public static void main(String args[]){
        Another a = new Another();
        a.setData();
        a.printData();
    }
}