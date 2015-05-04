package com.company;

import com.company.Operations.Add;
import com.company.Operations.Command;
import com.company.Operations.Display;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Controller control = new Controller();
//        System.out.println("Type Help for commands;");
        System.out.println("Enter Command:");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String commandLine = scanner.nextLine();
            if (commandLine.equals("EXIT")) {
                break;
            }
            try {
                control.execute(commandLine);
            } catch (NullPointerException e) {
                System.out.println("No such command");
            } catch (NumberFormatException e) {
                System.out.println("Operand not valid");
            } catch (ArithmeticException e) {
                System.out.println("Arthimetic exception check operand");
            }
        }
        System.out.println("Exiting application.");
    }
}
