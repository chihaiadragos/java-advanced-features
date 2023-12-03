package ExercisesForLiveCodingAdvanced.Exercise7;

public class Main {
    public static void main(String[] args) {
        WeaponMagazine weaponMagazine = new WeaponMagazine(5);
        System.out.println(weaponMagazine);
        System.out.println(weaponMagazine.isLoaded());
        System.out.println();
        weaponMagazine.loadBullet("bullet1");
        weaponMagazine.loadBullet("bullet2");
        weaponMagazine.loadBullet("bullet3");
        weaponMagazine.loadBullet("bullet4");
        weaponMagazine.loadBullet("bullet5");
        weaponMagazine.loadBullet("bullet6");

        System.out.println(weaponMagazine);
        System.out.println(weaponMagazine.isLoaded());
        weaponMagazine.shot();
        weaponMagazine.shot();
        System.out.println(weaponMagazine);
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
    }
}
