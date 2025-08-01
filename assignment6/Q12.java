class Test{
    public static void main(String args[]){
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j < B.length; j++){
                for (int k = 0; k < C.length ; k++){
                    if(A[i] == B[j] && A[i] == C[k]){
                        System.out.print(A[i]+" ");
                    }
                }
            }
        }
    }
}