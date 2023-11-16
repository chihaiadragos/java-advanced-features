package ClassTaxonomy.Features.Interfaces;

public class Main {
    public static void main(String[] args) {
        StreamingPlayer netflix = new NetflixStreamingPlayer();
        StreamingPlayer prime = new PrimeStreamingPlayer();

        netflix.playMovie("Batman");
        prime.playMovie("Spider-Man");

        netflix.stopMovie();
        prime.stopMovie();

        System.out.println("Prime subscription is " + prime.getSubscriptionPrice());
        System.out.println("Netflix subscription is " + netflix.getSubscriptionPrice() + '\n');

        StreamingPlayer streamingPlayer = new StreamingPlayer() {
            @Override
            public void playMovie(String movie) {
                System.out.println("Playing movie " + movie + " on my awesome streaming player.");
            }

            @Override
            public void stopMovie() {
                System.out.println("Stopping movie on my awesome streaming player.");
            }

            @Override
            public double getSubscriptionPrice() {
                return 5.99;
            }
        };

        System.out.println("My awesome player subscription is " + streamingPlayer.getSubscriptionPrice());
        streamingPlayer.playMovie("Titanic");
        streamingPlayer.stopMovie();
    }
}
