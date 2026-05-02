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
        String output = RomanPrinter.print(1);
        verifyOutput(output);
    }

    @Test
    public void testPrint2() {
        String output = RomanPrinter.print(2);
        verifyOutput(output);
    }

    @Test
    public void testPrint3() {
        String output = RomanPrinter.print(3);
        verifyOutput(output);
    }

    // Metodo helper per evitare ripetizioni
    private void verifyOutput(String output) {
        assertNotNull("L'output non deve essere nullo", output);
        assertFalse("L'output non deve essere vuoto", output.isEmpty());
    }
}