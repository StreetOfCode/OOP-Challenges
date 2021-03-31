package sk.streetofcode.domain;

public enum Grade {
    _1(1),
    _2(2),
    _3(3),
    _4(4),
    _5(5);

    private final int value;

    Grade(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public int getValue() {
        return value;
    }
}
