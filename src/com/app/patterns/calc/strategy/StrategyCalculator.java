package com.app.patterns.calc.strategy;

import com.app.patterns.calc.Calculator;
import com.app.patterns.calc.CalculatorType;
import com.app.patterns.calc.Operation;

import java.util.HashMap;
import java.util.Map;

import static com.app.patterns.calc.Operation.*;

/**
 * Pattern : Strategy (Behavioral)
 */
public class StrategyCalculator implements Calculator {

    private final Map<Operation, CalculationStrategy> strategies = new HashMap<>();
    private CalculationStrategy strategy;

    {
        strategies.put(ADD, new AdditionStrategy());
        strategies.put(SUB, new SubtractionStrategy());
        strategies.put(MUL, new MultiplicationStrategy());
        strategies.put(DIV, new DivisionStrategy());
        strategies.put(POW, new ExponentiationStrategy());
    }

    @Override
    public double eval(double operand1, double operand2, Operation op) {
        strategy = strategies.get(op);
        return strategy.calculate(operand1, operand2);
    }

    @Override
    public CalculatorType getType() {
        return CalculatorType.StrategyCalculator;
    }
}
