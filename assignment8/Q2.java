class Book{
    private String title;
    private String author;
    private int price;

    public void setTitle(String title){
        this.title=title;

    }
    public void setAuthor(String author){
        this.author=author;

    }
    public void setPrice(int price){
        this.price=price;

    }
    public void display(){
        System.out.print("book title="+title);
         System.out.print("book author="+author);
          System.out.print("book price="+price);
    }
}
class Test{
    public static void main(String args[]){
        Book b=new Book();
        b.setTitle("secret");
        b.setAuthor("rhonda");
        b.setPrice(450);
        b.display();
    }
}