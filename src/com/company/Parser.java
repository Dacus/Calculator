package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dacus on 5/4/2015.
 */
public class Parser {
    public static String getCommand(String input) {
        return parseInputByRegex(input, "\\D+");
    }

    public static Float getOperand(String input) {
        try {
            return Float.valueOf(parseInputByRegex(input, "\\d.*"));
        } catch (NullPointerException e) {
            return null;
        }
    }

    private static String parseInputByRegex(String input, String pattern) {
        Pattern getPattern = Pattern.compile(pattern);
        Matcher getMatcher = getPattern.matcher(input);
        String operand;
        if (getMatcher.find()) {
            operand = getMatcher.group(0);
            operand = operand.trim();
            if (operand.equals("")) {
                return null;
            }
            return operand;

        }
        return null;
    }
}
