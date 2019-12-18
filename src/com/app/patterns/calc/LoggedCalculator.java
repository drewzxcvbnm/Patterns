package com.app.patterns.calc;

/**
 * Pattern : Proxy (Structural)
 */
public class LoggedCalculator implements Calculator {

    private Calculator calculator;

    public LoggedCalculator(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public CalculatorType getType() {
        return calculator.getType();
    }

    @Override
    public double eval(double operand1, double operand2, Operation op) {
        System.out.println(String.format("Proxy logging -- Operand1:%s, Operand2:%s, Operation:%s", operand1, operand2, op));
        double res = calculator.eval(operand1, operand2, op);
        System.out.println(String.format("Proxy logging -- Result is %s", res));
        return res;
    }
}
