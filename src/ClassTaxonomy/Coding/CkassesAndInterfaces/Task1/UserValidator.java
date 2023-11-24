package ClassTaxonomy.Coding.CkassesAndInterfaces.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public String validateEmails(String email) {

        Email formattedEmail = new Email(email);
        return formattedEmail.getFormattedEmail();
    }

    private static class Email {
        private String formattedEmail;

        public Email(String email) {
            validateAndFormat(email);
        }

        public String getFormattedEmail() {
            return formattedEmail;
        }

        private void validateAndFormat(String email) {
            if (email == null || email.trim().isEmpty()) {
                formattedEmail = "unknown";
                return;
            }

            String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);

            formattedEmail = matcher.matches() ? email : "unknown";
        }
    }
}
