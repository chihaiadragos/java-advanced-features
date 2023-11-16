package ObjectOrientedProgramming.Features.Inheritance;

public class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private int costOfStudy;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, int costOfStudy) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.costOfStudy = costOfStudy;
        this.yearOfStudy = yearOfStudy;
        System.out.println("Inside student constructor");
    }

    @Override
    public double getAccommodationPrice() {
        return 120;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Type of study: " + typeOfStudy);
        System.out.println("Cost of study: " + costOfStudy);
        System.out.println("Year of study: " + yearOfStudy);
    }
}
