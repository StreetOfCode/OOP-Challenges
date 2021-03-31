package sk.streetofcode.domain;

import java.util.Collections;
import java.util.List;

public class Student {
    private final String name;
    private final List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        if (subjects.size() < 3) {
            throw new RuntimeException("Student must take at least 3 subjects");
        }
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return Collections.unmodifiableList(subjects);
    }

    public String getName() {
        return name;
    }
}
