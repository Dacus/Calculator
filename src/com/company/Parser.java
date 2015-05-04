package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dacus on 5/4/2015.
 */
public class Parser {
    public static String getCommand(String input) {
        Pattern getCommandPattern = Pattern.compile("[^0-9]{1,}");
        Matcher getCommandMatcher = getCommandPattern.matcher(input);

        String command = new String();
        if (getCommandMatcher.find()) {
            command = getCommandMatcher.group(0);
            command = command.trim();
            return command;
        }
        return "";
    }

    public static Float getOperand(String input) {
        Pattern getOperandPattern = Pattern.compile("[0-9]{1,}");
        Matcher getOperandMatcher = getOperandPattern.matcher(input);

        String operandString = new String();
        if (getOperandMatcher.find()) {
            operandString = getOperandMatcher.group(0);
            operandString = operandString.trim();
            if (operandString.equals("")) {
                return null;
            }
            Float operand = Float.parseFloat(operandString);
            return operand;

        }
        return null;
    }
}
