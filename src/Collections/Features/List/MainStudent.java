package Collections.Features.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {

    public static void main(String[] args) {
        Student student1 = new Student("Ana", 22);
        Student student2 = new Student("Alina", 23);
        Student student3 = new Student("Marius", 21);
        Student student4 = new Student("Ana", 22);
        Student student5 = new Student("Mihaela", 22);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);
        System.out.println();

        Collections.sort(students);
        System.out.println(students);

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        };

        students.sort(nameComparator);
        System.out.println(students);

        Comparator<Student> nameComparatorDesc = nameComparator.reversed();
        students.sort(nameComparatorDesc);
        System.out.println();
        System.out.println(students);
        System.out.println();

        Comparator<Student> nameAndAgeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getName().equals(student2.getName())) {
                    return 0;
                }
            }
        }
    }

}
