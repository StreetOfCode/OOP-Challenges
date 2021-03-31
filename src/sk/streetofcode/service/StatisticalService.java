package sk.streetofcode.service;

import sk.streetofcode.domain.Grade;
import sk.streetofcode.domain.Student;
import sk.streetofcode.domain.Subject;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StatisticalService {

    public static List<Result> getSortedStudentsByTheirAvgGrade(List<Student> students) {
        return students.stream()
                .map(student -> new Result(student.getName(), getStudentAvgGrade(student)))
                .sorted(Comparator.comparing(Result::getAvg))
                .collect(Collectors.toList());
    }

    public static List<Result> getSortedSubjectsByTheirAvgGrade(Map<Subject, List<Grade>> subjectGrades) {
        return subjectGrades.entrySet().stream()
                .map(entry -> new Result(entry.getKey().getName(), getAvgGrade(entry.getValue())))
                .sorted(Comparator.comparing(Result::getAvg))
                .collect(Collectors.toList());
    }

    public static List<Result> getSortedClassesByTheirBestStudents(Map<String, List<Student>> classWithStudents) {
        return classWithStudents.entrySet().stream()
                .map(entry -> new Result(
                                entry.getKey(),
                                entry.getValue().stream().mapToDouble(StatisticalService::getStudentAvgGrade).average().orElse(0.0)
                        )
                )
                .sorted(Comparator.comparing(Result::getAvg))
                .collect(Collectors.toList());
    }

    private static double getStudentAvgGrade(Student student) {
        return GradeService.getInstance().getStudentSubjectGrades(student)
                .values()
                .stream()
                .mapToInt(Grade::getValue)
                .average().orElse(0.0);
    }

    private static double getAvgGrade(List<Grade> grades) {
        return grades.stream()
                .mapToInt(Grade::getValue)
                .average().orElse(0.0);
    }

    public static class Result {
        private final String name;
        private final double avg;

        Result(String name, double avg) {
            this.name = name;
            this.avg = avg;
        }

        public double getAvg() {
            return avg;
        }

        @Override
        public String toString() {
            return name + " - " + String.format("%.2f", avg);
        }
    }

}
