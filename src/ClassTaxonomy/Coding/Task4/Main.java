package ClassTaxonomy.Coding.Task4;


public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(-55, user.ageValidator);
        System.out.println(user);

    }
}
