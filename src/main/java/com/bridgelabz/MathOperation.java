package com.bridgelabz;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a,int b);
}

public class MathOperation {

    public static void main(String[] args) {
        IMathFunction add = Integer::sum;
        IMathFunction multiply = (int a, int b) -> (a * b);
        IMathFunction divide = (int a, int b) -> (a / b);

        System.out.println("Addition = " + add.calculate(4, 2));
        System.out.println("Multiplication = " + multiply.calculate(4, 2));
        System.out.println("Division = " + divide.calculate(4, 2));
    }
}