package ObjectOrientedProgramming.Features.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("Mihai", "Bucuresti", "Java", 1, 3500);
        student.showDetails();
        System.out.println("Student pays: " + student.getAccommodationPrice());

        System.out.println("------------------");
        Person lecturer = new Lecturer("Batman", "Cluj", "Law", 3000);
        lecturer.showDetails();
        System.out.println("Lecturer pays: " + lecturer.getAccommodationPrice());
    }
}
