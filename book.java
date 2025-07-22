public class book {
    String title;
    float price;
    public void new_book(){
        title ="Java porgraming";
        System.out.print("Title:"+ " "+title);
        System.out.println();
        price =101;
        System.out.print("Price:"+" "+ price);
    }
    public static void main(String args[]){
        book obj=new book();
        obj.new_book();
    } 
}