package com.app.patterns.calc;

public interface Calculator {

    CalculatorType getType();

    double eval(double operand1, double operand2, Operation op);

}

