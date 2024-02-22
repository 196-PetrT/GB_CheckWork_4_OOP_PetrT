package calc.impl;

import calc.core.complexCalculator.ComplexNumber;
import calc.core.logger.Decorator;
import calc.core.util.Operators;
import calc.core.views.View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleComplexView implements View {
    private final List<String> validOperators;


    public ConsoleComplexView(Decorator decorator) {

        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());
    }

    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        int result = -1;
        try {
            result = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Not number was enter. Please enter number");
            promptInt(message);
        }
        return result;
    }


    @Override
    public void start() {
        View.super.start();
    }

    @Override
    public void prepare() {
        double a;
        double b;
        ComplexNumber complex1;
        ComplexNumber complex2;
        ComplexNumber complexResult;

        System.out.println("(a + bi) 'operator' (c + di)\n");

        a = promptInt("Input a:");

        b = promptInt("Input b:");
        complex1 = new ComplexNumber(a, b);

        String operator = getOperator();

        a = promptInt("Input c:");

        b = promptInt("Input d:");
        complex2 = new ComplexNumber(a, b);


        if (operator.equals("*")) {
            complexResult = complex1.multiply(complex2);
            System.out.println("The result is: " + complexResult.toString());
        }
//
        if (operator.equals("+")) {
            complexResult = complex1.add(complex2);
            System.out.println("The result is: " + complexResult.toString());
        }

        if (operator.equals("/")) {
            complexResult = complex1.divide(complex2);
            System.out.println("The result is: " + complexResult.toString());
        }

        if (operator.equals("-")) {
            complexResult = complex1.subtract(complex2);
            System.out.println("The result is: " + complexResult.toString());
        }


//        ComplexNumber.clear();
    }



    @Override
    public String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("Continue?... (y/n)");
        return in.nextLine();
    }

    @Override
    public String getOperator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the math operation (*, +, /, -) : ");
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Entered invalid math operator. " + "Enter the math operation (*, +, /, -) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }
}
