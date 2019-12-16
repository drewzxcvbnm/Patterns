package com.app.patterns.calc.strategy;

public class MultiplicationStrategy implements CalculationStrategy {

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
