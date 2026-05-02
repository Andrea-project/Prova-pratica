////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint1() {
        verifyOutput(RomanPrinter.print(1));
    }

    @Test
    public void testPrint2() {
        verifyOutput(RomanPrinter.print(2));
    }

    @Test
    public void testPrint3() {
        verifyOutput(RomanPrinter.print(3));
    }

    @Test
    public void testPrint4() {
        verifyOutput(RomanPrinter.print(4));
    }

    @Test
    public void testPrint5() {
        verifyOutput(RomanPrinter.print(5));
    }

    @Test
    public void testPrint6() {
        verifyOutput(RomanPrinter.print(6));
    }

    // Metodo helper per evitare ripetizioni
    private void verifyOutput(String output) {
        assertNotNull("L'output non deve essere nullo", output);
        assertFalse("L'output non deve essere vuoto", output.isEmpty());
    }
}