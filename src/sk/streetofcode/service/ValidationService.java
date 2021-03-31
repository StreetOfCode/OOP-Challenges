package sk.streetofcode.service;

import sk.streetofcode.domain.Clazz;
import sk.streetofcode.domain.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidationService {

    private ValidationService() {
    }

    public static ValidationService getInstance() {
        if (instance == null) {
            instance = new ValidationService();
        }
        return instance;
    }

    private static ValidationService instance;

    public void validateThatStudentIsMemberOfOneClass(List<Clazz> classes) {
        final List<Student> allStudents = new ArrayList<>();
        classes.forEach(clazz -> allStudents.addAll(clazz.getStudents()));

        final Set<Student> allDistinctStudents = new HashSet<>(allStudents);
        if (allStudents.size() != allDistinctStudents.size()) {
            throw new RuntimeException("Each student must be in exactly one class");
        }
    }
}
