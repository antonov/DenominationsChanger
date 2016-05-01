package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test DenominationsChanger class.
 */
public class DenominationsChangerTest {
    /** Check the number of returned bills **/
    @Test
    public void testMakeChanges() throws Exception {
        DenominationsChanger denominationsChanger = new DenominationsChanger();
        assertEquals("The number of bills is 4", 4, denominationsChanger.MakeChanges(135));
        assertEquals("The number of bills is 2", 2, denominationsChanger.MakeChanges(200));
        assertEquals("The number of bills is 2", 2, denominationsChanger.MakeChanges(60));
        assertEquals("The number of bills is 20", 20, denominationsChanger.MakeChanges(2000));
    }

}