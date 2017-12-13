package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
            //Logger logger = new Logger();
            //logger.log("yo man");
        Logger.getInstance().log("hello");

        //When
            //String result = logger.getLastLog();
        String result = Logger.getInstance().getLastLog();

        //Then
            //Assert.assertEquals("yo man", result);
        Assert.assertEquals("hello", result);
    }
}
