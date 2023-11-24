package ClassTaxonomy.Coding.CkassesAndInterfaces.Task1;

public class Main {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();

        String validatedEmail = userValidator.validateEmails("amamam@guma.com");
        System.out.println("Validated Email: " + validatedEmail);
    }
}
