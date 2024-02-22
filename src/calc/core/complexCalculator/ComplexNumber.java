package calc.core.complexCalculator;

public class ComplexNumber implements ComplexCalculable{
    private double a;
    private double b;
    private double newA;
    private double newB;

    ComplexNumber newComplex;

    public ComplexNumber(){
    }

    public ComplexNumber(double indexA, double indexB){
        a = indexA;
        b = indexB;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }

    public String toString(){
        return "(" + a + ") + (" + b + ")i";
    }


    @Override
    public ComplexNumber add(ComplexNumber otherNumber) {
        newA = a + otherNumber.getA();
        newB = b + otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber otherNumber) {
        newA = a - otherNumber.getA();
        newB = b - otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber otherNumber) {
        newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    @Override
    public ComplexNumber divide(ComplexNumber otherNumber) {
        newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) /
                ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) /
                ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

}

