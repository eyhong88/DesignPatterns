package com.ood.pattern.strategy;

/**
 * Created by ehong on 4/15/2019.
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator){
        this.calculator = calculator;
    }

    public double calculate(int num1, int num2){
        return calculator.doOperation(num1, num2);
    }
}
