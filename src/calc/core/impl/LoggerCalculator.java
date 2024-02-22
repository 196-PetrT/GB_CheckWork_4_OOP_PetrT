package calc.core.impl;

import calc.Calculable;

public class LoggerCalculator implements Calculable {

    private Calculable calk;

    public LoggerCalculator(Calculable calk) {
        this.calk = calk;
    }

    @Override
    public void sum(double a, double b) {
        System.out.printf("суммирую: %s, %s%n", a, b);
        calk.sum(a, b);
        System.out.println(result());
    }

    @Override
    public void multiply(double a, double b) {
        System.out.printf("умножаю: %s, %s%n", a, b);
        calk.multiply(a, b);
        System.out.println(result());
    }

    @Override
    public void divide(double a, double b) {
        System.out.printf("делю: %s, %s%n", a, b);
        calk.divide(a, b);
        System.out.println(result());
    }

    @Override
    public void subtraction(double a, double b) {
        System.out.printf("вычитаю: %s, %s%n", a, b);
        calk.subtraction(a, b);
        System.out.println(result());
    }

    @Override
    public double result() {
        return calk.result();
    }

    @Override
    public void clear() {
        calk.clear();
    }
}