# SCHOOL CHALLENGE
## Difficulty: PRE-INTERMEDIATE
##### Remember to write readable, clean code with object oriented principles. The goal of this challenge is to practice Java OOP concepts while maintaining simplicity. 
##### Beware of over engineering. The hardest thing is to find balance.

### School description:
_Create different entities in school. You can create all instances in Main class. Your job is to create entities with given unbreakable relationships and then print some statistical data._ 

In this challenge you have to design school system which have certain rules. You will practice [composition](https://stackify.com/oop-concepts-composition/). Your program will have very little functionality. How you design your classes matters.

##### School consists of these entities:
1. Classes - group of students (You can’t name class ‘Class’ so name it ‘Clazz’) 
2. Teachers 
3. Students
4. Subjects
5. Grades

##### Relationships between entities (Rules):
- Every class has one primary teacher (it’s just a role) and multiple students
- Teacher can teach multiple subjects
- Student can take multiple subjects
- Student must be member of exactly one class
- Every subject has exactly one teacher
- Student must have a grade in each subject. (Grades are between 1 and 5)

Each rule must be kept. You can use some form of validation, for example throw a RuntimeException with a message if some rule is broken. See [this](https://github.com/StreetOfCode/OOP-Challenges/blob/QUIZ/src/Question.java#L35) for inspiration.
Think carefully how you apply your rules. For example you can have property ‘teacher’ in ‘Subject’ which represent teacher of this subject, or you can have property ‘subjects’ in ‘Teacher’ class. Or maybe you can have both? Which design is better?

##### More constrains:
- Have at least 2 classes
- Each class has at least 3 students
- Each student takes at least 3 subjects
You can use deduction to find out how many teachers you need.
#
#### Statistical data:
1. Print sorted students by their average grades
2. Print sorted subjects by average of grades given to students
3. Print sorted classes with the best students (by average of each student’s average grade)

#
**Bonus A:**

Create every instance using command line. Ask user to add students to classes, give grades, etc.

**Bonus B:**

Load and instantiate all objects from file.

**Bonus C:**

Create [class diagram](https://www.uml-diagrams.org/class-diagrams-overview.html) of your application, which shows structure of the designed system at the level of classes and relationships. Class diagram is type of UML diagram, which are used in software development.


`You can choose any bonus, both of them or neither.`
#

#### Program output example (made up data):
````
Sorted students by their average grades:
Alice - 1.5
Bob - 2
Mark - 3.5

Sorted subjects by average of grades given to students:
Math - 3
Physics - 2.5
History - 1.5

Sorted classes with the best students:
2.B - 2
4.A - 2.5
1.C - 3

````


