abstract  class ITEM {
    private String title;
    private String author;

    ITEM(String title,String author) {
        this.title=title;
        this.author=author;
    }
    
    abstract void display();
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    
}
