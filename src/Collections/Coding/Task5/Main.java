package Collections.Coding.Task5;

import Collections.Coding.Task2.Book;
import Collections.Coding.Task2.BookService;
import Collections.Coding.Task2.Genre;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book book1 = new Book("Venom", 100, null, null, Genre.ACTION);
        Book book2 = new Book("Batman", 200, null, null, Genre.SF);
        Book book3 = new Book("124Hours", 100, null, null, Genre.ACTION);
        Book book4 = new Book("X-Men", 300, null, null, Genre.ANIME);
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        bookService.addBook(book4);

        System.out.println(bookService.getAllBooks());

        descendingPriceListSort(bookService);

        System.out.println(bookService.getAllBooks());
    }
    public static void descendingPriceListSort(BookService bookService) {
        Comparator<Book> priceComparator = new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getPrice(), book2.getPrice());
            }
        };

        bookService.getAllBooks().sort(priceComparator);
    }

}
