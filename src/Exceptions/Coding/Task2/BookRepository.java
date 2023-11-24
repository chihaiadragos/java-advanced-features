package Exceptions.Coding.Task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books;
    public BookRepository() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int ID) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getID() == ID) {
                books.remove(ID);
                return;
            }
        }
        throw new NoBookFoundException("Can not delete book with ID: " + ID);
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book getBookByName(String bookName) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getTitle().equals(bookName)) {
                return book;
            }
        }
        throw new NoBookFoundException("No book with title: " + bookName);

    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                "}";
    }
}
