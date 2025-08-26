// occurence of all elements in array
import java.util.Scanner;
class Test{
    public static void main (String args[]){
        int arr[] = {4,5,65,4,56,4,4,5,6,4};        
        boolean b[] =  new boolean[n];
        for (int i = 0 ; i <arr.length-1 ;i ++){
            if(b[i])
             continue;
            int cnt = 1 ;  
            for (int j = i+1 ; j<arr.length; j++){
                     if(arr[i]==arr[j])
                     cnt++;
                     b[j]=true;
            }
            Syste.out.println("")
            
        }
    }
}