package calc.core.logger;

import calc.core.complexCalculator.ComplexCalculable;
import calc.core.complexCalculator.ComplexNumber;



public class Decorator implements ComplexCalculable {

    private  ComplexCalculable calk;

    private LoggerConsole logger;

    public Decorator(ComplexCalculable calk) {
        this.calk = calk;
    }

    @Override
    public ComplexNumber add(ComplexNumber otherNumber) {
        logger.logg("operation - 'sum'");
        return calk.add(otherNumber);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber otherNumber) {
        logger.logg("operation - 'subtract'");
        return calk.subtract(otherNumber);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber otherNumber) {
        logger.logg("operation - 'multiply'");
        return calk.multiply(otherNumber);
    }

    @Override
    public ComplexNumber divide(ComplexNumber otherNumber) {
        logger.logg("operation - 'divide'");
        return calk.divide(otherNumber);
    }
}
