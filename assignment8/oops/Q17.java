import java.util.ArrayList;
class Movie {
    ArrayList<String> actors = new ArrayList<>();
    ArrayList<Integer> reviews = new ArrayList<>();
    private String title;
    private String director;
    public Movie(ArrayList actors,ArrayList review,String title, String director){
        this.actors = actors;
        this.reviews = review;
        this.title = title;
        this.director = director;
    }
    public Movie(String title, String director){
        this.title = title;
        this.director = director;
    }
    public void addReview(int review) {
        reviews.add(review);
    }
    public ArrayList reteriveReview(){
        return actors;
    }
    public void addActors(String actors){
        this.actors.add(actors);
    }
    public void printDetails(){
        System.out.println("Director : "+this.director+ " Title : "+this.title+ " Actors are: ");
        for(String ac : actors){
            System.out.print(ac + " ");
        }
        System.out.println();
        System.out.println("Reviews : ");
        for(int review : reviews){
            System.out.print(review + " ");
        }
    }
}
class Test{
    public static void main(String args[]){
        Movie m = new Movie("Sciecne fiction","James Kambron");
        m.addReview(5);
        m.addActors("Rober Downey Jr.");
        m.addReview(4);
        m.addReview(4);
        m.printDetails();
    }
}