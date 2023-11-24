package ClassTaxonomy.Coding.CkassesAndInterfaces.Task2;

public class Main {
    public static void main(String[] args) {
        Movie.MovieCreator movieCreator = new Movie.MovieCreator();
        Movie movie = new Movie();
        System.out.println(movieCreator.setDirector(movie, "Marcus"));
        System.out.println(movieCreator.setTitle(movie, "Batman"));
        System.out.println(movieCreator.setReleaseYear(movie, 2009));
        System.out.println(movieCreator.createMovie());

    }
}
