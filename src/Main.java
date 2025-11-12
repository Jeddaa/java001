import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Book book = new Book("Purple Hibiscus", "Chimamanda Adichie", 270);
        AudioBook audioBook  = new AudioBook("Naked in death", "J.D. Robb", 30_000);
        Ebook test = new Ebook("Grace of Allah", "Prophet Muhammad", 663, "pdf");

        System.out.println(test.toString());

    }
}
