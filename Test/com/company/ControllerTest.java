package com.company;

import static org.junit.Assert.*;

/**
 * Created by Dacus on 5/4/2015.
 */
public class ControllerTest {

    @org.junit.Test
    public void testExecute() throws Exception {
        Controller controller = new Controller();
        controller.execute("ADD 4");
        controller.execute("DIVIDE BY 5");
        controller.execute("MULTIPLY BY 2");
        controller.execute("SUBTRACT 10");
        controller.execute("DISPLAY RESULT");
        controller.execute("ADD 2");
        controller.execute("DISPLAY RESULT");
    }
}