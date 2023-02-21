public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String userTitle, int userPages, int userYear) {
        this.title = userTitle;
        this.pages = userPages;
        this.year = userYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getPages() {
        return pages;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, "  + this.year;
    }
    
}
