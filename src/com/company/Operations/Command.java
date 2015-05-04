package com.company.Operations;

/**
 * Created by intern on 4/30/15.
 */
public abstract class Command {
    public float execute(float result, float operand) {
        return result;
    }

    public float execute(float result) {
        return result;
    }
}
