package calculator;

import calculator.argumentsProvider.ArgumentProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    Calculator calculator;

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testAddTwoNumbers(int firstNumber, int secondNumber) {
        int expected = firstNumber + secondNumber;
        char operation = '+';
        calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expected, calculator.calculate(operation));
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testSubtractTwoNumbers(int firstNumber, int secondNumber) {
        int expected = firstNumber - secondNumber;
        char operation = '-';
        calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expected, calculator.calculate(operation));
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testMultiplyTwoNumbers(int firstNumber, int secondNumber) {
        int expected = firstNumber * secondNumber;
        char operation = '*';
        calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expected, calculator.calculate(operation));
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testDivideTwoNumbers(int firstNumber, int secondNumber) {
        int expected = firstNumber / secondNumber;
        char operation = '/';
        calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expected, calculator.calculate(operation));
    }

    @ParameterizedTest
    @CsvSource({"5, 0"})
    public void testDivideNumberByZero(int firstNumber, int secondNumber) {
        char operation = '/';
        assertThrows(ArithmeticException.class, () -> new Calculator(firstNumber, secondNumber).calculate(operation));
    }

    @ParameterizedTest
    @CsvSource({"2,2", "3,3", "5,4"})
    public void testExponentiation(int number, int powValue) {
        char operation = "pow".charAt(0);
        double expected = Math.pow(number, powValue);
        calculator = new Calculator(number, powValue);
        assertEquals(expected, calculator.calculate(operation));
    }

    @ParameterizedTest
    @CsvSource({"4,2", "3,2", "9,2", "16,2"})
    public void testSquareRootOfNumber(int number, int square) {
        char operation = "square".charAt(0);
        double expected = Math.sqrt(number);
        calculator = new Calculator(number, square);
        assertEquals(expected, calculator.calculate(operation));
    }
}