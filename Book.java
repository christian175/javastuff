public class Book {

    private String author;
    private int pages;

    public Book(String _author, int _pages){
        author = _author;
        pages = _pages;
    }

    public String getAuthor(){
        return author;
    }

    public int getPages(){
        return pages;
    }
}
