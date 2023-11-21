package GenericTypes.Coding.Task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java", LocalDate.of(2000, 7, 1), "a1", 100);
        Book book2 = new Book("Java", LocalDate.of(2011, 1, 22), "a2", 200);
        Book book3 = new Book("Java", LocalDate.of(2002, 11, 17), "a3", 300);

        System.out.println("Books library");
        MediaLibrary<Book> bookMediaLibrary = new MediaLibrary<>();

        bookMediaLibrary.addMedia(book1);
        bookMediaLibrary.addMedia(book2);
        bookMediaLibrary.addMedia(book3);

        bookMediaLibrary.prinMedias();

        System.out.println("Initial book library total price is: " + bookMediaLibrary.calculateTotalMediasPrice());

        bookMediaLibrary.deleteMedia(book1);

        bookMediaLibrary.prinMedias();

        System.out.println("Initial book library total price is: " + bookMediaLibrary.calculateTotalMediasPrice());
        System.out.println();

        Movie movie1 = new Movie("Fast and Furious", LocalDate.of(2014, 1, 19), "Ben", 200);
        Movie movie2 = new Movie("X-Men", LocalDate.of(2001, 10, 10), "Jim", 200);
        Movie movie3 = new Movie("IT", LocalDate.of(2019, 7, 27), "Tim", 200);
        Movie movie4 = new Movie("Avengers", LocalDate.of(2022, 12,30), "Roger", 200);

        System.out.println("Movies library");
        MediaLibrary<Movie> movieMediaLibrary = new MediaLibrary<>();

        movieMediaLibrary.addMedia(movie1);
        movieMediaLibrary.addMedia(movie2);
        movieMediaLibrary.addMedia(movie3);
        movieMediaLibrary.addMedia(movie4);


        movieMediaLibrary.prinMedias();
        System.out.println();

        System.out.println("Initial book library total price is: " + movieMediaLibrary.calculateTotalMediasPrice());
        System.out.println();


        NewsPaper newsPaper1 = new NewsPaper("NYT", LocalDate.of(2023, 1, 2), "Roberto", 4);
        NewsPaper newsPaper2 = new NewsPaper("The future", LocalDate.of(2023, 5, 21), "Miguel", 4);
        NewsPaper newsPaper3 = new NewsPaper("Perfect", LocalDate.of(1999, 11, 5), "Jimbo", 4);
        NewsPaper newsPaper4 = new NewsPaper("No time left", LocalDate.of(1890, 9, 15), "Martyn", 4);
        System.out.println("NewsPaper library");

        MediaLibrary<NewsPaper> newsPaperMediaLibrary = new MediaLibrary<>();

        newsPaperMediaLibrary.addMedia(newsPaper1);
        newsPaperMediaLibrary.addMedia(newsPaper2);
        newsPaperMediaLibrary.addMedia(newsPaper3);
        newsPaperMediaLibrary.addMedia(newsPaper4);

        newsPaperMediaLibrary.prinMedias();

        System.out.println("Newspaper total price is: " +newsPaperMediaLibrary.calculateTotalMediasPrice());
        System.out.println();

    }
}
