package ClassTaxonomy.Features.InnerClasses;


public class Movie {
    private String title;
    private String directorName;
    private int yearOfRelease;
    private String genre;
    private String distributor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", directorName='" + directorName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                ", distributor='" + distributor + '\'' +
                '}';
    }

    static class MovieBuilder {
        private String title;
        private String directorName;
        private int yearOfRelease;
        private String genre;
        private String distributor;

        public MovieBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder setDirectorName(String directorName) {
            this.directorName = directorName;
            return this;
        }

        public MovieBuilder setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public MovieBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieBuilder setDistributor(String distributor) {
            this.distributor = distributor;
            return this;
        }

        public Movie build() {
            Movie movie = new Movie();
            movie.title = this.title;
            movie.directorName = this.directorName;
            movie.yearOfRelease = this.yearOfRelease;
            movie.genre = this.genre;
            movie.distributor = this.distributor;
            return movie;
        }
    }
}

