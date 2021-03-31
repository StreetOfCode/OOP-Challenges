package sk.streetofcode.domain;

import sk.streetofcode.service.ValidationService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class School {
    private final List<Clazz> classes;

    public School(List<Clazz> classes) {
        if (classes.size() < 2) {
            throw new RuntimeException("School has to have at least 2 classes");
        }
        ValidationService.getInstance().validateThatStudentIsMemberOfOneClass(classes);
        this.classes = classes;
    }

    public Map<String, List<Student>> getStudentsInClass() {
        return classes.stream().collect(Collectors.toUnmodifiableMap(Clazz::getName, Clazz::getStudents));
    }
}
