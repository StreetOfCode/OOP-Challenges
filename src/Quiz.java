import java.util.Collections;
import java.util.List;

class Quiz {
    private final String name;
    private final List<Question> questions;

    Quiz(String name, List<Question> questions) {
        this.name = name;
        this.questions = Collections.unmodifiableList(questions);
    }

    int getQuestionsSize() {
        return questions.size();
    }

    void printQuizInfo() {
        System.out.println("Welcome to quiz " + name + ".");
        System.out.println("This quiz has " + getQuestionsSize() + " questions.");
        System.out.println();
    }

    boolean isAnswerCorrect(String correctAnswer, String usersAnswer) {
        if (correctAnswer.length() == 1) {
            return correctAnswer.equals(usersAnswer);
        } else {
            // Question with multiple answers. Is every answer correct?
            for (Character c : correctAnswer.toCharArray()) {
                if (!usersAnswer.contains(c.toString())) {
                    return false;
                }
            }
            return true;
        }
    }

    void printQuestion(int index) {
        System.out.println(
                (index + 1) + ". " + questions.get(index).getDescription() + " (Question with " + questions.get(index).getQuestionType() + ")"
        );
    }

    String printAnswersAndReturnCorrect(int index) {
        StringBuilder rightAnswers = new StringBuilder();
        char answerIndex = 'a';
        for (Answer answer : questions.get(index).getAnswers()) {
            System.out.print(answerIndex + ". ");
            System.out.println(answer.getDescription());
            if (answer.isCorrect()) rightAnswers.append(answerIndex);
            answerIndex++;
        }
        return rightAnswers.toString();
    }
}
