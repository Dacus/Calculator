package com.company.Operations;

/**
 * Created by intern on 4/30/15.
 */
public class Display extends Command {
    @Override
    public float execute(float result) {
        System.out.println(result);
        return result;
    }
}
