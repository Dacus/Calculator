package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.company.Add;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandLine = scanner.nextLine();
        Pattern p = Pattern.compile("[^0-9]{1,}");
        Pattern p2 = Pattern.compile("[0-9]{1,}");
        Matcher m = p.matcher(commandLine);
        Matcher m2 = p2.matcher(commandLine);
        String command = new String();
        if (m.find( )) {
            command = m.group(0);
            command = command.trim();
        }


        float result = 0;
        HashMap<String, Operation> commands = new HashMap<String, Operation>();
        commands.put("ADD", new Add());
        commands.put("DISPLAY RESULT", new Display());
        Operation o = commands.get(command);
        if(m2.find()) {
            float number = Float.valueOf(m2.group(0));
            result = o.execute(result,number);
        } else {
            o.execute();
        }
        System.out.println(result);

    }
}
