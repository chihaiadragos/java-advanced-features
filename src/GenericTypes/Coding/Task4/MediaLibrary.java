package GenericTypes.Coding.Task4;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary<T extends Media> {
    private List<T> medias = new ArrayList<>();

    public void addMedia(T media) {
        medias.add(media);
    }

    public void deleteMedia(T media) {
        medias.remove(media);
    }

    public void prinMedias() {
        for (T media : medias) {
            System.out.println(media);
        }
        System.out.println();
    }
    public double calculateTotalMediasPrice() {
        double totalPrice = 0;
        for (T media : medias) {
            totalPrice += media.calculatePrice();
        }
        return totalPrice;
    }
}
