package ClassTaxonomy.Features.InnerClasses;


public class Main {
    public static void main(String[] args) {

        Movie.MovieBuilder builder1 = new Movie.MovieBuilder();

        Movie movie1 = builder1.setTitle("Batman")
                .setDirectorName("Tom")
                .setYearOfRelease(2012)
                .setGenre("action")
                .setDistributor("distributor1")
                .build();

        System.out.println(movie1);
        System.out.println();


        Movie movie2 = new Movie.MovieBuilder().setTitle("Spider-Man").setYearOfRelease(2020).setGenre("Action").build();
        System.out.println(movie2);
        System.out.println();

        Car car1 = new Car("renault", "economy");
        System.out.println(car1);
        Car car2 = new Car("BMW", "luxury");
        System.out.println(car2);
        Car car3 = new Car("dacia", "turbo");
        System.out.println(car3);

    }
}

