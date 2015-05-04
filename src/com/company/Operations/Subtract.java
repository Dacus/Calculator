package com.company.Operations;

/**
 * Created by Dacus on 5/4/2015.
 */
public class Subtract extends Command {
    @Override
    public float execute(float result, float operand) {
        return result - operand;
    }
}
