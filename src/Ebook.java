public class Ebook extends Book{
    private String format;

    Ebook(String title, String author, int pageCount, String format){
        super(title, author, pageCount);
        this.format = format;
    }

//    public String toString(){
//        return String.format("%s by %s with page number %d", this.title, this.author, this.pageCount);
//    }
}
