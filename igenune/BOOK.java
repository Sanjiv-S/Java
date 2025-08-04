public class BOOK extends ITEM implements borrowable {
    private String genre;

     BOOK(String title,String author,String genre) {
        super(title,author);
        this.genre=genre;
    }
   
    @Override
    void display() {
        System.out.println("Title of the Book:"+getTitle());
        System.out.println("Author of the Book:"+getAuthor());
        System.out.println("genre of the book is:"+genre);
    }
    
}
