package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        Calculator calculator;
        try {
            n1 = Integer.parseInt(sc.next());
            n2 = Integer.parseInt(sc.next());
            calculator = new Calculator(n1, n2);
            System.out.println("Plus result: " + calculator.calculate('+'));
            System.out.println("Minus result: " + calculator.calculate('-'));
            System.out.println("Multiply result: " + calculator.calculate('*'));
            System.out.println("Division result: " + calculator.calculate('/'));
            System.out.println("Exponentiation result: "+calculator.calculate('p'));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Не допустимый ввод, только цифры!!!");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя!!!");
        }
    }
}



