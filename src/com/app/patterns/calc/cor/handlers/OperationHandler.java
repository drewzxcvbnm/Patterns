package com.app.patterns.calc.cor.handlers;

import com.app.patterns.calc.Operation;

public abstract class OperationHandler {

    private OperationHandler next;

    public abstract double handle(double operand1, double operand2, Operation op);

    double delegate(double operand1, double operand2, Operation op) {
        if (next == null) {
            System.out.println("-- No appropriate handler");
            throw new UnsupportedOperationException();
        }
        System.out.print("->");
        return next.handle(operand1, operand2, op);
    }

    public OperationHandler then(OperationHandler handler) {
        next = handler;
        return next;
    }

}
