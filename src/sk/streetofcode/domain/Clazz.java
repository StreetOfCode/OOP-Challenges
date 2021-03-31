package sk.streetofcode.domain;

import java.util.Collections;
import java.util.List;

public class Clazz {

    private final String name;
    private final Teacher primaryTeacher;
    private final List<Student> students;

    public Clazz(String name, Teacher teacher, List<Student> students) {
        this.name = name;
        this.primaryTeacher = teacher;
        if (students.size() < 3) {
            throw new RuntimeException("Class has to have at least 3 students");
        }
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
