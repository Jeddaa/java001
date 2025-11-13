package borrowBook;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    User (String name, String birthday, Book books){
        this.name = name;
        this.birthDay = LocalDate.parse(birthday);
        borrow(books);
    }

    public String getName(){
        return this.name;
    }

    public String getBirthDay(){
        return this.birthDay.toString();
    }

    public String borrowedBooks(){
        return this.books.toString();
    }


    public void borrow(Book book) {
        this.books.add(book);
    }
    public int age(){
       return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

}
