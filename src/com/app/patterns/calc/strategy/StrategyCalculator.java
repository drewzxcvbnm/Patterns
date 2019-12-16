package com.app.patterns.calc.strategy;

import com.app.patterns.calc.Calculator;
import com.app.patterns.calc.CalculatorType;
import com.app.patterns.calc.Operation;

/**
 * Pattern: Strategy (Behavioral)
 */
public class StrategyCalculator implements Calculator {

    private CalculationStrategy strategy;

    @Override
    public double eval(double operand1, double operand2, Operation op) {
        switch (op) {
            case ADD:
                System.out.println(String.format("%s: %s + %s", getType(), operand1, operand2));
                strategy = new AdditionStrategy();
                break;
            case SUB:
                System.out.println(String.format("%s: %s - %s", getType(), operand1, operand2));
                strategy = new SubtractionStrategy();
                break;
            case MUL:
                System.out.println(String.format("%s: %s * %s", getType(), operand1, operand2));
                strategy = new MultiplicationStrategy();
                break;
            case DIV:
                System.out.println(String.format("%s: %s / %s", getType(), operand1, operand2));
                strategy = new DivisionStrategy();
                break;
            case POW:
                System.out.println(String.format("%s: %s ^ %s", getType(), operand1, operand2));
                strategy = new ExponentiationStrategy();
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return strategy.calculate(operand1, operand2);
    }

    @Override
    public CalculatorType getType() {
        return CalculatorType.StrategyCalculator;
    }
}
