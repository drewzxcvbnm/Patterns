package com.app.patterns.calc;

import com.app.patterns.factory.CalculatorFactory;

/**
 * Pattern : Facade (Structural)
 */
public class CalculatorFacade {

    private Calculator calculator;

    public CalculatorFacade(CalculatorType type) {
        calculator = new CalculatorFactory().getCalculator(type);
    }

    public double add(double a, double b) {
        return calculator.eval(a, b, Operation.ADD);
    }

    public double sub(double a, double b) {
        return calculator.eval(a, b, Operation.SUB);
    }

    public double mul(double a, double b) {
        return calculator.eval(a, b, Operation.MUL);
    }

    public double div(double a, double b) {
        return calculator.eval(a, b, Operation.DIV);
    }

}
