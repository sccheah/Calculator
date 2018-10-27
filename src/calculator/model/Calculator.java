package calculator.model;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int input) {
        value += input;
    }

    public void subtract(int input) {
        value -= input;
    }

    public void clear() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
