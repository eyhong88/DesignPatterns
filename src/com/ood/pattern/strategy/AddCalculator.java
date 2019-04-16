package com.ood.pattern.strategy;

/**
 * Created by ehong on 4/11/2019.
 */
public class AddCalculator implements Calculator {

    @Override
    public double doOperation(int val1, int val2){
        return val1 + val2;
    }
}
