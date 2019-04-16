package com.ood.pattern.strategy;

/**
 * Created by ehong on 4/11/2019.
 */
public class Runner {
    public static void main(String... lings){
        Context context = new Context(new AddCalculator());
        System.out.println(context.calculate(1, 2));
        context = new Context(new SubtractCalculator());
        System.out.println(context.calculate(5, 1));
    }
}
