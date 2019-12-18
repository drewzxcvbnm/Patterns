package com.app.patterns;

import com.app.patterns.calc.Calculator;
import com.app.patterns.calc.CalculatorFacade;
import com.app.patterns.calc.LoggedCalculator;
import com.app.patterns.factory.CalculatorFactory;

import static com.app.patterns.calc.CalculatorType.CorCalculator;
import static com.app.patterns.calc.CalculatorType.StrategyCalculator;
import static com.app.patterns.calc.Operation.*;

/**
 * Must make use of at least 1 creational GoF pattern, 1 behavioral GoF pattern, and 1 structural GoF pattern
 * Solution must use at least 4 non-creational GoF patterns in total
 */
public class Main {

    public static void main(String[] args) {
        CalculatorFactory factory = new CalculatorFactory();
        System.out.println("Using Calculator that implements strategy pattern:");
        Calculator strategyCalculator = factory.getCalculator(StrategyCalculator);
        System.out.println("Result: " + strategyCalculator.eval(1, 2, ADD));
        System.out.println("Result: " + strategyCalculator.eval(4, 2, POW));

        System.out.println("");

        System.out.println("Using Calculator that implements chain of responsibility pattern:");
        Calculator corCalculator = factory.getCalculator(CorCalculator);
        System.out.println("Result: " + corCalculator.eval(4, 5, MUL));
        System.out.println("Result: " + corCalculator.eval(8, 5, DIV));
        try {
            System.out.println("Result: " + corCalculator.eval(8, 5, POW));
        } catch (UnsupportedOperationException e) {
            System.out.println("POW operation is not supported");
        }

        System.out.println("");

        System.out.println("Using Calculator Proxy:");
        Calculator loggedCalculator = new LoggedCalculator(strategyCalculator);
        loggedCalculator.eval(4, 6, ADD);

        System.out.println("");

        System.out.println("Using Calculator Facade:");
        CalculatorFacade calculatorFacade = new CalculatorFacade(CorCalculator);
        System.out.println("Result: " + calculatorFacade.add(2, 5));
        System.out.println("Result: " + calculatorFacade.div(88, 23));


    }
}
