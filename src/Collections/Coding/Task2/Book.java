package Collections.Coding.Task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private int price;
    private LocalDate releaseDate;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, int price, LocalDate releaseDate, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(releaseDate, book.releaseDate) && Objects.equals(authors, book.authors) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, releaseDate, authors, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        int titleComparison = this.title.compareTo(book.title);
        if (titleComparison == 0) {
            return Integer.compare(this.price, book.price);
        }
        return titleComparison;
        //             SAU
//        if (this.title.equals(book.title)) {
//            return Integer.compare(this.price, book.price);
//        }
//        return this.title.compareTo(book.title);
    }
}
