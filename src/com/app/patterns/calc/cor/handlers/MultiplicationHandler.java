package com.app.patterns.calc.cor.handlers;

import com.app.patterns.calc.Operation;

import static com.app.patterns.calc.Operation.MUL;

public class MultiplicationHandler extends OperationHandler {

    @Override
    public double handle(double operand1, double operand2, Operation op) {
        System.out.print(" MultiplicationHandler ");
        if (op == MUL) {
            System.out.println("-- Valid handler");
            System.out.println(String.format("Multiplying: %s * %s", operand1, operand2));
            return operand1 * operand2;
        }
        return delegate(operand1, operand2, op);
    }
}
