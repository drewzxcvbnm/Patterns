package com.app.patterns.factory;

import com.app.patterns.calc.Calculator;
import com.app.patterns.calc.CalculatorType;
import com.app.patterns.calc.SwitchCalculator;
import com.app.patterns.calc.cor.CorCalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Pattern: Factory method (Creational)
 */
public class CalculatorFactory {

    private Map<CalculatorType, Supplier<Calculator>> calculatorSuppliers = new HashMap<>();

    public CalculatorFactory() {
        calculatorSuppliers.put(CalculatorType.SwitchCalculator, SwitchCalculator::new);
        calculatorSuppliers.put(CalculatorType.CorCalculator, CorCalculator::new);
    }

    public Calculator getCalculator(CalculatorType type) {
        return calculatorSuppliers.get(type).get();
    }

}
