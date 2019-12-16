package com.app.patterns.calc.strategy;

public class ExponentiationStrategy implements CalculationStrategy {
    @Override
    public double calculate(double operand1, double operand2) {
        return Math.pow(operand1, operand2);
    }
}
