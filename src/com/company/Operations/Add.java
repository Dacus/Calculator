package com.company.Operations;

/**
 * Created by intern on 4/30/15.
 */
public class Add extends Command {
//    private Add(){}

    @Override
    public float execute(float result, float operand) {
        return result + operand;
    }
}
