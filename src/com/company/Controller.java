package com.company;

import com.company.Operations.*;

/**
 * Created by Dacus on 5/4/2015.
 */
public class Controller {
    private float result;
    private Calculator calc;

    public Controller() {
        result = 0;
        calc = new Calculator();
        calc.addCommand("ADD", new Add());
        calc.addCommand("DISPLAY RESULT", new Display());
        calc.addCommand("DIVIDE BY", new Divide());
        calc.addCommand("MULTIPLY BY", new Multiply());
        calc.addCommand("SUBTRACT", new Subtract());
    }

    public void execute(String input) {
        String command = Parser.getCommand(input);
        Float operand;
        operand = Parser.getOperand(input);
        if (operand == null) {
            result = calc.executeCommand(command, result);
            return;
        }
        result = calc.executeCommand(command, result, operand);
    }
}
