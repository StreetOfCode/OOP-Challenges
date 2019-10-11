import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Question {
    private final String description;
    private final QuestionType questionType;
    private final List<Answer> answers;

    private Question(QuestionBuilder questionBuilder) {
        this.description = questionBuilder.description;
        this.answers = Collections.unmodifiableList(questionBuilder.answers); // important
        this.questionType = determineQuestionType();
    }

    String getDescription() {
        return description;
    }

    QuestionType getQuestionType() {
        return questionType;
    }

    List<Answer> getAnswers() {
        return answers;
    }

    private QuestionType determineQuestionType() {
        final long correctAnswersCount = answers.stream().filter(Answer::isCorrect).count();
        if (correctAnswersCount > 1) {
            return QuestionType.MULTIPLE_ANSWERS;
        } else if (correctAnswersCount == 1) {
            return QuestionType.SINGLE_ANSWER;
        } else {
            throw new RuntimeException("Question has to have at least one correct answer");
        }
    }

    static class QuestionBuilder {
        private final String description;
        private List<Answer> answers = new ArrayList<>();

        QuestionBuilder(String description) {
            this.description = description;
        }

        QuestionBuilder addAnswer(Answer answer) {
            this.answers.add(answer);
            return this;
        }

        Question build() {
            return new Question(this);
        }
    }

}
