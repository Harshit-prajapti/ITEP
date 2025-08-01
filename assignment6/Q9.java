class Test{
    public static void main(String args[]){
        int first[] = {1,2,3,4,5,6,7};
        int second[] = {5,6,7,8,9};
        boolean visited2 = new boolean[first.length];
        boolean visited[] = new boolean[first.length];
        int union[] = new int[first.length + second.length];
        int intercetion[] = new int[first.length];
        for(int i = 0; i<first.length ; i++){
            for(int j = 0; j<second.length ; j++){
                if(first[i] == second[j] && visited[i] != true){
                    intercetion[i] = first[i];
                    visited[i] = true;
                }
            }
        }
        // for(int i = 0; i<first.length ; i++){
        //     if()
        // }
        for(int i = 0 ; i<intercetion.length ; i++){
            System.out.print(intercetion[i]+" ");
        }
    }
}