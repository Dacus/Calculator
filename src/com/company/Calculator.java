package com.company;

import com.company.Operations.Command;

import java.util.HashMap;

/**
 * Created by Dacus on 5/4/2015.
 */
public class Calculator {
    private HashMap<String, Command> commands = new HashMap<String, Command>();


    public Calculator() {
    }

    public void addCommand(String command, Command commandObject) {
        commands.put(command, commandObject);
    }

    public float executeCommand(String command, float result, float operand) {
        Command commandObject = commands.get(command);
        return commandObject.execute(result, operand);
    }

    public float executeCommand(String command, float result) {
        Command commandObject = commands.get(command);
        return commandObject.execute(result);
    }
}
