public class Borrowed_Book extends BOOK {
    private String borrowerName; 
    private String  duedate; 

    public Borrowed_Book(String title,String author,String genre,String borrowerName,String duedate) {
       super(title ,author,genre);
       this.borrowerName=borrowerName;
       this.duedate=duedate;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Borrower Name:"+borrowerName);
        System.out.println("Due date:"+duedate);
    }
    
}
