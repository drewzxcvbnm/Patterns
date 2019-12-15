package com.app.patterns.calc.cor;

import com.app.patterns.calc.Calculator;
import com.app.patterns.calc.CalculatorType;
import com.app.patterns.calc.Operation;
import com.app.patterns.calc.cor.handlers.*;

/**
 * Pattern: Chain of Responsibility (Behavioral)
 */
public class CorCalculator implements Calculator {

    private OperationHandler handler = new AdditionHandler();

    public CorCalculator() {
        handler.then(new SubtractionHandler())
                .then(new MultiplicationHandler())
                .then(new DivisionHandler());
    }

    @Override
    public CalculatorType getType() {
        return CalculatorType.CorCalculator;
    }

    @Override
    public double eval(double operand1, double operand2, Operation op) {
        return handler.handle(operand1, operand2, op);
    }
}
