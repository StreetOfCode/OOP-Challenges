#QUIZ CHALLENGE
##Difficulty: EASY
##### Remember to write readable, clean code with object oriented principles. The goal of this challenge is to practice Java OOP concepts while maintaining simplicity. 
##### Beware of over engineering. The hardest thing is to find balance.

###Quiz description:
Create command line Java application Quiz. 

#####Lifecycle of application:
1. Start application.
2. Greet player in console and describe your quiz.
3. Print out first question. Don’t forget to include which kind of question it is. 
4. Print possible answers.
5. Scan input.
6. Repeat 3.-5. until last question.
7. Print out how many answers were correct.
8. End program

#####Constraints:
- There has to be at least two types of questions - e.g. single choice, multiple choice, open answer.
- Each question has at least two answers to choose from (max 5).
- Collect user points and print them after quiz ends. 
- Quiz has to have at least 3 questions.

#
**Bonus A:**

Let player choose from multiple quizzes at the start of the application. After one quiz is finished, let him choose another quiz or end the game.  

**Bonus B:**

Whole quizz is loaded from file (json, xml, csv, …).

**Bonus C:**

Use at least one design pattern. (Don’t over engineer though)


`You can choose any bonus, all of them or none.`
#

#### Program output example:
````
Welcome to quiz Math Quiz.
This quiz has 3 questions.

1. What is 2 + 2? (Question with single answer)
a. 5
b. 4
b (user input)
2. What is 2 + 5? (Question with single answer)
a. 4
b. 7
b (user input)
3. 4 = ? (Question with multiple answers)
a. 2^2
b. -2^2
c. 1 + 3
d. 4^1
abcd (user input, bacd would be correct as well)
You had 3/3 answers correct

Process finished with exit code 0
````


