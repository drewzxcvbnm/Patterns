package com.app.patterns.calc;

public class SwitchCalculator implements Calculator {

    @Override
    public double eval(double operand1, double operand2, Operation op) {
        switch (op) {
            case ADD:
                System.out.println(String.format("%s: %s + %s", getType(), operand1, operand2));
                return operand1 + operand2;
            case SUB:
                System.out.println(String.format("%s: %s - %s", getType(), operand1, operand2));
                return operand1 - operand2;
            case MUL:
                System.out.println(String.format("%s: %s * %s", getType(), operand1, operand2));
                return operand1 * operand2;
            case DIV:
                System.out.println(String.format("%s: %s / %s", getType(), operand1, operand2));
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public CalculatorType getType() {
        return CalculatorType.SwitchCalculator;
    }
}
