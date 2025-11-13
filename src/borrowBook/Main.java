package borrowBook;

import mortgageCalculator.MortgageCalculator;

public class Main {
    public static void main(String[] args) {
        Book testBook = new Book("Glory in death", "J.D. Robb", 207);
        User testUser = new User("Fatihah Oduwole", "1990-01-10", testBook);

        System.out.println("User name: " + testUser.getName());
        System.out.println("User Age: " + testUser.age() + "years old");

        testUser.borrow(new Book("Creation in Death", "J.D. Robb", 309));
        System.out.println("User borrowed books: " + testUser.borrowedBooks());


    }
}