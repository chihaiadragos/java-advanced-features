package Exceptions.Coding.Task2;

public class Book {
    private int ID;
    private String title;
    private String author;
    private int yearOfRelease;

    public Book(int ID, String title, String author, int yearOfRelease) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
