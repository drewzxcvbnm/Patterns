package com.app.patterns.calc.cor.handlers;

import com.app.patterns.calc.Operation;

import static com.app.patterns.calc.Operation.ADD;

public class AdditionHandler extends OperationHandler {

    @Override
    public double handle(double operand1, double operand2, Operation op) {
        System.out.print(" AdditionHandler ");
        if (op == ADD) {
            System.out.println("-- Valid handler");
            System.out.println(String.format("Adding: %s + %s", operand1, operand2));
            return operand1 + operand2;
        }
        return delegate(operand1, operand2, op);
    }
}
