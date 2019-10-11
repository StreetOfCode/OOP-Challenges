class Answer {
    private final String description;
    private final boolean correct;

    Answer(String description, boolean correct) {
        this.description = description;
        this.correct = correct;
    }

    String getDescription() {
        return description;
    }

    boolean isCorrect() {
        return correct;
    }
}
