package calculator;

public class Calculator {
    private int a;
    private int b;


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float calculate(char operation) throws ArithmeticException {
        switch (operation) {
            case '-': {
                return a - b;
            }
            case '+': {
                return a + b;
            }
            case '/': {
                return a / b;
            }
            case '*': {
                return a * b;
            }
            case 'p': {
                return getPow(a, b);
            }
            default: {
                throw new IllegalArgumentException("Не верная математическая операция!!!");
            }
        }
    }

    private int getPow(int value, int powValue) {
        if (powValue == 1 || powValue == 0) {
            return value;
        } else {
            return value * getPow(value, powValue - 1);
        }
    }
}
