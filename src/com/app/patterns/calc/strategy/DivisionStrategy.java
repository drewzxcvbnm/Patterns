package com.app.patterns.calc.strategy;

public class DivisionStrategy implements CalculationStrategy {

    @Override
    public double calculate(double operand1, double operand2) {
        System.out.println(String.format("Using division strategy: %s / %s", operand1, operand2));
        return operand1 / operand2;
    }
}
