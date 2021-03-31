package sk.streetofcode;

import sk.streetofcode.domain.*;
import sk.streetofcode.service.GradeService;
import sk.streetofcode.service.StatisticalService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////// CREATE OBJECTS //////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////

        // Create 3 teachers
        final Teacher teacherLeo = new Teacher("Leo");
        final Teacher teacherErica = new Teacher("Erica");
        final Teacher teacherJames = new Teacher("James");

        // Create 5 subjects
        final Subject math = new Subject("math", teacherLeo);
        final Subject science = new Subject("science", teacherErica);
        final Subject physics = new Subject("physics", teacherLeo);
        final Subject programming = new Subject("programming", teacherJames);
        final Subject algorithms = new Subject("algorithms", teacherJames);

        // Create 6 students
        final Student mark = new Student("Mark", List.of(math, science, physics));
        final Student alice = new Student("Alice", List.of(math, programming, physics));
        final Student bob = new Student("Bob", List.of(math, science, programming));
        final Student john = new Student("John", List.of(math, science, algorithms));
        final Student mary = new Student("Mary", List.of(programming, science, algorithms));
        final Student carlos = new Student("Carlos", List.of(math, science, physics));
        final List<Student> students = List.of(mark, alice, bob, john, mary, carlos);

        // Create 2 classes
        final Clazz clazz1A = new Clazz("1A", teacherLeo, List.of(mark, alice, bob));
        final Clazz clazz1B = new Clazz("1B", teacherErica, List.of(john, mary, carlos));

        // Create school
        final School school = new School(List.of(clazz1A, clazz1B));

        //////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////// ADD GRADES ///////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////

        GradeService.getInstance().assignRandomGrades(students);

        //////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////// PRINT STATISTICS  ////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Sorted students by their average grades:");
        StatisticalService.getSortedStudentsByTheirAvgGrade(students).forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted subjects by average of grades given to students:");
        StatisticalService.getSortedSubjectsByTheirAvgGrade(GradeService.getInstance().getSubjectGrades()).forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted classes with the best students:");
        StatisticalService.getSortedClassesByTheirBestStudents(school.getStudentsInClass()).forEach(System.out::println);
    }
}
