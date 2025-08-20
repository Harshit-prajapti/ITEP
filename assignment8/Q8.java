class ResultChecker {
    private String name;
    private float mathMarks;
    private float scienceMarks;
    public void setName(String name){
        this.name = name;
    }
    public void setMathMarks(float mathMarks){
        this.mathMarks = mathMarks;
    }
    public void setScienceMarks(float scienceMarks){
        this.scienceMarks = scienceMarks;
    }
    public void display(){
        System.out.println(name);
        System.out.println((mathMarks+scienceMarks)/2);
    }
}
class Test{
    public static void main(String args[]){
        ResultChecker r = new ResultChecker();
        r.setName("Harshit");
        r.setMathMarks(88);
        r.setScienceMarks(91);
        r.display();
    }
}