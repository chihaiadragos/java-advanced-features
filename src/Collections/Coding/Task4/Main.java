package Collections.Coding.Task4;

import Collections.Coding.Task2.Book;
import Collections.Coding.Task2.BookService;
import Collections.Coding.Task2.Genre;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book book1 = new Book("Venom", 100, null, null, Genre.ACTION);
        Book book2 = new Book("Batman", 200, null, null, Genre.SF);
        Book book3 = new Book("Venom", 100, null, null, Genre.ACTION);
        Book book4 = new Book("X-Men", 300, null, null, Genre.ANIME);
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        bookService.addBook(book4);

        System.out.println(bookKeyInfo(bookService.getAllBooks()));
    }

    public static HashMap<Genre, String> bookKeyInfo(List<Book> books) {
        HashMap<Genre, String> result = new HashMap<>();
        for (Book book : books) {
            result.put(book.getGenre(), book.getTitle());
        }
        return  result;
    }
}
