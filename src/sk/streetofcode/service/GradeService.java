package sk.streetofcode.service;

import sk.streetofcode.domain.Grade;
import sk.streetofcode.domain.Student;
import sk.streetofcode.domain.Subject;

import java.util.*;
import java.util.stream.Collectors;

public class GradeService {

    private GradeService() {
    }

    public static GradeService getInstance() {
        if (instance == null) {
            instance = new GradeService();
        }
        return instance;
    }

    private static GradeService instance;
    private final Map<Student, Map<Subject, Grade>> studentGrades = new HashMap<>();
    private final Random random = new Random();
    private final int GRADE_COUNT = Grade.values().length;

    public void assignRandomGrades(List<Student> students) {
        for (Student student : students) {
            studentGrades.putIfAbsent(student, new HashMap<>());
            for (Subject subject : student.getSubjects()) {
                studentGrades.get(student).put(subject, Grade.values()[random.nextInt(GRADE_COUNT)]);
            }
        }
    }

    public Map<Subject, List<Grade>> getSubjectGrades() {
        return studentGrades.values().stream()
                .flatMap(studentGrades -> studentGrades.entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(
                                Map.Entry::getValue,
                                Collectors.toList()
                        )
                ));
    }

    public Map<Subject, Grade> getStudentSubjectGrades(Student student) {
        return Collections.unmodifiableMap(studentGrades.getOrDefault(student, new HashMap<>()));
    }


}
