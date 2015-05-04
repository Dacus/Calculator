package com.company.Operations;

/**
 * Created by Dacus on 5/4/2015.
 */
public class Divide extends Command {
    @Override
    public float execute(float result, float operand) throws ArithmeticException {
        if (operand == 0) {
            throw new ArithmeticException();
        }
        return result / operand;
    }
}
