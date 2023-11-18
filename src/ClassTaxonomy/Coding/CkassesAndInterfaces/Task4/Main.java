package ClassTaxonomy.Coding.CkassesAndInterfaces.Task4;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(-55, user.ageValidator);
        System.out.println(user);

    }
}

