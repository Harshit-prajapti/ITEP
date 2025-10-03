// 3. "Hello 1 world 2 welcome 3"
//  You have to add numeric value.
class Test{
    public static void main(String args[]){
        String s = "Hello 1 world 2 welcome 3";
        String data[] = s.split(" ");
        int sum = 0;
        for(int i = 0 ; i<data.length; i++){
            try{
                sum += Integer.parseInt(data[i]);
            }catch(Exception e){e.printStackTrace();}
        }
        System.out.println(sum);
    }
}