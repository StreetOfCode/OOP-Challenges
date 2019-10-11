import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Question> questionList = new ArrayList<>();
        questionList.add(
                new Question.QuestionBuilder("What is je 2 + 2?")
                        .addAnswer(new Answer("5", false))
                        .addAnswer(new Answer("4", true))
                        .build()
        );
        questionList.add(
                new Question.QuestionBuilder("What is je 2 + 5?")
                        .addAnswer(new Answer("4", false))
                        .addAnswer(new Answer("7", true))
                        .build()
        );
        questionList.add(
                new Question.QuestionBuilder("4 = ?")
                        .addAnswer(new Answer("2^2", true))
                        .addAnswer(new Answer("-2^2", true))
                        .addAnswer(new Answer("1 + 3", true))
                        .addAnswer(new Answer("4^1", true))
                        .build()
        );

        Quiz quiz = new Quiz("Math Quiz", questionList);
        quiz.printQuizInfo();

        int points = 0;
        for (int index = 0; index < quiz.getQuestionsSize(); index++) {

            quiz.printQuestion(index);
            final String correctAnswer = quiz.printAnswersAndReturnCorrect(index);
            final String usersAnswer = scanner.next();

            if (quiz.isAnswerCorrect(correctAnswer, usersAnswer)) {
                points++;
            }
        }

        System.out.println("You had " + points + "/" + quiz.getQuestionsSize() + " answers correct");
    }
}
