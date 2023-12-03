package ExercisesForLiveCodingAdvanced.Exercise7;

import java.util.ArrayList;
import java.util.List;

public class WeaponMagazine {
    private final List<String> bulletMagazine;
    private final int bulletMagazineSize;
    public WeaponMagazine(int magazineSize) {
        this.bulletMagazineSize = magazineSize;
        this.bulletMagazine = new ArrayList<>();
    }

    public void loadBullet(String bullet) {
        if (bulletMagazine.size() < bulletMagazineSize) {
            bulletMagazine.add(bullet);
            System.out.println("Bullet loaded<>");
        } else {
            System.out.println("Magazine is full!");
        }
    }

    public boolean isLoaded() {
        return !bulletMagazine.isEmpty();
    }

    public void shot() {
        if (!bulletMagazine.isEmpty()) {
            String lastBullet = bulletMagazine.remove(bulletMagazine.size() - 1);
            System.out.println("Shot fired: " + lastBullet);

            if (!bulletMagazine.isEmpty()) {
                System.out.println("Preparing next bullet: " + bulletMagazine.get(bulletMagazine.size() - 1));
            } else {
                System.out.println("Empty magazine.");
            }
        } else {
            System.out.println("Empty magazine.");
        }
    }

    @Override
    public String toString() {
        return "WeaponMagazine{" +
                "bulletMagazine=" + bulletMagazine +
                ", bulletMagazineSize=" + bulletMagazineSize +
                '}';
    }
}
