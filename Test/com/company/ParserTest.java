package com.company;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dacus on 5/4/2015.
 */
public class ParserTest {

    @org.junit.Test
    public void testGetCommand() throws Exception {
        assertEquals(Parser.getCommand("ADD 13"), "ADD");
    }

    @org.junit.Test
    public void testGetOperand() throws Exception {
        assertEquals(Parser.getOperand("ADD 13"), 13, 0);
    }
}