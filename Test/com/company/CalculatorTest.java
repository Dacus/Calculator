package com.company;

import com.company.Operations.Add;
import com.company.Operations.Display;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

/**
 * Created by Dacus on 5/4/2015.
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddCommand() throws Exception {
        calculator.addCommand("ADD", new Add());
    }

    @Test
    public void testExecuteCommand() throws Exception {
        calculator.addCommand("ADD", new Add());
        assertEquals(calculator.executeCommand("ADD", 13, 13), 26, 0);
    }

    @Test
    public void testExecuteCommand1() throws Exception {
        calculator.addCommand("DISPLAY RESULT", new Display());
        assertEquals(calculator.executeCommand("DISPLAY RESULT", 13), 13, 0);
    }
}