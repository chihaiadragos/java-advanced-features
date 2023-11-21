package GenericTypes.Coding.Task4;

import java.time.LocalDate;

public class Book extends Media{
    private String author;
    private int numberOfPages;

    public Book(String title, LocalDate publicationDate, String author, int numberOfPages) {
        super(title, publicationDate);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public double calculatePrice() {
        return numberOfPages * 5;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
