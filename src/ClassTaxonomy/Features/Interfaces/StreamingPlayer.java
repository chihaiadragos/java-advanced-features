package ClassTaxonomy.Features.Interfaces;
//interfatele sunt ca un fel de CONTRACTE;

public interface StreamingPlayer {
    //static final constantele (by default in interfata)
    int MAX_NUMBER_OF_USERS = 10;

    //public abstract metodele (by default in interfata)
    //metodele pot fi si statice
    void playMovie(String movie);

    void stopMovie();

    default double getSubscriptionPrice(){
        return 99.9;
    }
}