import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term");
        int term = sc.nextInt();
    //     int i = term*(-1);
       
        
    //     while(i<term*2){
            
    //         if(i % 3 != 0){
    //             i++;
    //         }else {
    //             System.out.print(i + " ");
    //             i+=3;
    //         }
            
    //     }
    int i = (term/2)*(-1);
    System.out.println(i);
    while(i<i*(-2)){
        if(i%3 != 0){
            i++;
        }else{
            System.out.print(i+" ");
            i += 3;
        }
    }
     }
}
