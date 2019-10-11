public enum QuestionType {
    SINGLE_ANSWER, MULTIPLE_ANSWERS;

    @Override
    public String toString() {
        switch (this) {
            case SINGLE_ANSWER:
                return "single answer";
            case MULTIPLE_ANSWERS:
                return "multiple answers";
            default:
                throw new RuntimeException();
        }
    }
}
