package com.app.patterns;

import com.app.patterns.calc.Calculator;
import com.app.patterns.calc.CalculatorType;
import com.app.patterns.calc.LoggedCalculator;
import com.app.patterns.factory.CalculatorFactory;

import static com.app.patterns.calc.Operation.*;

/**
 * Must make use of at least 1 creational GoF pattern, 1 behavioral GoF pattern, and 1 structural GoF pattern
 * Solution must use at least 4 non-creational GoF patterns in total
 */
public class Main {

    public static void main(String[] args) {
        CalculatorFactory factory = new CalculatorFactory();
        System.out.println("SwitchCalculator:");
        Calculator switchCalculator = factory.getCalculator(CalculatorType.SwitchCalculator);
        System.out.println("Result: " + switchCalculator.eval(1, 2, ADD));
        System.out.println("Result: " + switchCalculator.eval(4, 2, SUB));

        System.out.println("");

        System.out.println("CorCalculator:");
        Calculator corCalculator = factory.getCalculator(CalculatorType.CorCalculator);
        System.out.println("Result: " + corCalculator.eval(4, 5, MUL));
        System.out.println("Result: " + corCalculator.eval(8, 5, DIV));
        try {
            System.out.println("Result: " + corCalculator.eval(8, 5, POW));
        } catch (UnsupportedOperationException e) {
            System.out.println("POW operation is not supported");
        }

        System.out.println("");

        Calculator loggedCalculator = new LoggedCalculator(switchCalculator);
        loggedCalculator.eval(4, 6, ADD);

    }
}
