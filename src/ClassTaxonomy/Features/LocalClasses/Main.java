package ClassTaxonomy.Features.LocalClasses;

public class Main {
    public static void main(String[] args) {

        String[] firstNames = {"Diana", "Andrei", "Ion"};
        String[] lastNames = {"Cotun", "Popescu", "Ionescu"};

        displayFullNames(firstNames, lastNames);





    }

    public static void displayFullNames(String[] firstNames, String[] lastNames) {
        class FullName {
            private String firstName;
            private String lastName;

            public FullName(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getFullName() {
                return firstName + " " + lastName;
            }

            @Override
            public String toString() {
                return "Name{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        '}';
            }


        }
        for (int i = 0; i < firstNames.length; i++) {
            FullName fullName1 = new FullName(firstNames[i], lastNames[i]);
            System.out.println(fullName1);
            System.out.println(fullName1.getFullName());
        }





    }
}
