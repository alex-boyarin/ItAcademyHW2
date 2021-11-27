package calculator;

import calculator.argumentsProvider.ArgumentProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {


    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testAddTwoNumbers(int firstNumber, int secondNumber) {
        int expectedResult = firstNumber + secondNumber;
        char operation = '+';
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expectedResult, calculator.calculate(operation));
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testSubtractTwoNumbers(int firstNumber, int secondNumber) {
        int expectedResult = firstNumber - secondNumber;
        char operation = '-';
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expectedResult, calculator.calculate(operation));
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testMultiplyTwoNumbers(int firstNumber, int secondNumber) {
        int expectedResult = firstNumber * secondNumber;
        char operation = '*';
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expectedResult, calculator.calculate(operation));
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void testDivideTwoNumbers(int firstNumber, int secondNumber) {
        int expectedResult = firstNumber / secondNumber;
        char operation = '/';
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        assertEquals(expectedResult, calculator.calculate(operation));
    }

    @ParameterizedTest
    @CsvSource({"5, 0"})
    public void testDivideNumberByZero(int firstNumber, int secondNumber) {
        char operation = '/';
        assertThrows(ArithmeticException.class, () -> new Calculator(firstNumber, secondNumber).calculate(operation));
    }
}