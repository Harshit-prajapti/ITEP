class Rating{
    private String name ;
    private String genre;
    private float rating;
    public void isHit(){
        if(rating >= 8.0) System.out.println("Movie is hit");
        else System.out.println("Movie is floap");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setRating(float rating){
        this.rating = rating;
    }
}
class Test{
    public static void main(String args[]){
        Rating r = new Rating();
        r.setName("Interstalaar");
        r.setGenre("good");
        r.setRating(7);
        r.isHit();
    }
}