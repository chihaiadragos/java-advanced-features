package ObjectOrientedProgramming.Coding.Task2;


public class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;

    public Student(String typeOfStudy, int yearOfStudy, double studyPrice) {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(double studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", studyPrice=" + studyPrice +
                '}';
    }
}

