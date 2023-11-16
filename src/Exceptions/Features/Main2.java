package Exceptions.Features;

public class Main2 {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Java", "James", 2000);
        Book book2 = new Book(2, "OOP", "Batman", 2010);
        Book book3 = new Book(3, "SDA", "James", 2011);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);

        bookRepository.printAllBooks();

        deleteBook(bookRepository, 1);
        deleteBook(bookRepository, 8);
    }

    private static void deleteBook(BookRepository bookRepository, int ID) {
        System.out.println("Deleting book with ID " + ID);
        try {
            bookRepository.removeBook(ID);
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
