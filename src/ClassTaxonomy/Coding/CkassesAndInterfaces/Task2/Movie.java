package ClassTaxonomy.Coding.CkassesAndInterfaces.Task2;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

     static class MovieCreator {
         private String title;
         private String director;
         private int releaseYear;

         public Movie setTitle(Movie movie, String title) {
             this.title = title;
             movie.setTitle(title);
             return movie;
         }

         public Movie setDirector(Movie movie, String director) {
             this.director = director;
             movie.setDirector(director);
             return movie;
         }

         public Movie setReleaseYear(Movie movie, int releaseYear) {
             this.releaseYear = releaseYear;
             movie.setReleaseYear(releaseYear);
             return movie;
         }
         public Movie createMovie() {
             Movie movie = new Movie();
             movie.setDirector(director);
             movie.setTitle(title);
             movie.setReleaseYear(releaseYear);
             return movie;
         }
     }
}
