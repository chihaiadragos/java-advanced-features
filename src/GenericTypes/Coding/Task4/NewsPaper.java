package GenericTypes.Coding.Task4;

import java.time.LocalDate;

public class NewsPaper extends Media{
    private String name;
    private int numberOfSections;

    public NewsPaper(String title, LocalDate publicationDate, String name, int numberOfSections) {
        super(title, publicationDate);
        this.name = name;
        this.numberOfSections = numberOfSections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSections() {
        return numberOfSections;
    }

    public void setSections(int sections) {
        this.numberOfSections = sections;
    }

    @Override
    public double calculatePrice() {
        return numberOfSections * 10;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "name='" + name + '\'' +
                ", numberOfSections=" + numberOfSections +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
