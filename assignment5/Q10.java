import java.util.Scanner;
// 10.WAP to to count the occurance of all element in array
class Test {
    public static void main(String args[]){
        int arr[] = {10,30,20,40,50,38,50,10,10,10};
        int visited[] = new int[arr.length];
        for(int j = 0; j<arr.length; j++){
            for(int k = 0; k<arr.length ; k++){
                if()
                if(arr[j] == arr[k]){
                    visited[j]++;
                }
            }
        }
        for(int i = 0; i<visited.length; i++){
            System.out.print(visited[i]+" ");
        }
    }
}