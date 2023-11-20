package GenericTypes.Coding.Task4;

import java.time.LocalDate;

public class Movie extends Media{
    private String director;
    private int numberOfActors;

    public Movie(String title, LocalDate publicationDate, String director,int numberOfActors) {
        super(title, publicationDate);
        this.director = director;
        this.numberOfActors = numberOfActors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumberOfActors() {
        return numberOfActors;
    }

    public void setNumberOfActors(int numberOfActors) {
        this.numberOfActors = numberOfActors;
    }

    @Override
    public double calculatePrice() {
        return numberOfActors * 3000;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", numberOfActors=" + numberOfActors +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
