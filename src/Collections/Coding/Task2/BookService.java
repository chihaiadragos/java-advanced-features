package Collections.Coding.Task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookService {
    private List<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> getBooksByGenre(Genre genre) {
        List<Book> booksByGenre = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                booksByGenre.add(book);
            }
        }
        return booksByGenre;
    }

    public List<Book> getBooksBeforeReleaseYear(int year) {
        List<Book> booksBeforeReleaseYear = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate().getYear() <= year) {
                booksBeforeReleaseYear.add(book);
            }
        }
        return booksBeforeReleaseYear;
    }

    public Book getMostExpensiveBook() {
        Book mostExpensiveBook = null;
        for (Book book : books) {
            if (mostExpensiveBook == null || mostExpensiveBook.getPrice() < book.getPrice()) {
                mostExpensiveBook = book;
            }
        }
        return mostExpensiveBook;
    }
    public Book getCheapestBook() {
        Book cheapestBook = null;
        for (Book book : books) {
            if (cheapestBook == null || book.getPrice() < cheapestBook.getPrice()) {
                cheapestBook = book;
            }
        }
        return cheapestBook;
    }
    public List<Book> getBooksByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

//    public List<Author> getAllAuthors() {
//        List<Author> authors = new ArrayList<>();
//        for (Book book : books) {
//            for (Author author : book.getAuthors()) {
//                if (!authors.contains(author)) {
//                    authors.add(author);
//                }
//            }
//        }
//        return authors;
//    }

    public Set<Author> getAllAuthors() {
        Set<Author> authors = new HashSet<>();
        for (Book book : books) {
            authors.addAll(book.getAuthors());
        }
        return authors;
    }
}
