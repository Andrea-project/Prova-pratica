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
    public void testPrintPrimiTreNumeri() {
        verifyOutput(RomanPrinter.print(1));
        verifyOutput(RomanPrinter.print(2));
        verifyOutput(RomanPrinter.print(3));
    }
    @Test
    public void testPrintPrimiSeiNumeri() {
        verifyOutput(RomanPrinter.print(4));
        verifyOutput(RomanPrinter.print(5));
        verifyOutput(RomanPrinter.print(6));
    }
    @Test
    public void testPrintPrimiDieciNumeri(){
        verifyOutput(RomanPrinter.print(7));
        verifyOutput(RomanPrinter.print(8));
        verifyOutput(RomanPrinter.print(9));
        verifyOutput(RomanPrinter.print(10));
    }
    @Test
    //da qua in poi dato i numeri sono tanti controllo solo i casi significativi
    public void testPrintPrimiVentiNumeri(){
        verifyOutput(RomanPrinter.print(11));
        verifyOutput(RomanPrinter.print(14));
        verifyOutput(RomanPrinter.print(15));
        verifyOutput(RomanPrinter.print(16));
        verifyOutput(RomanPrinter.print(19));
        verifyOutput(RomanPrinter.print(20));
    }

    private void verifyOutput(String output) {
        assertNotNull("L'output non deve essere nullo", output);
        assertFalse("L'output non deve essere vuoto", output.isEmpty());
    }

    @Test
public void testPrintFinoATrenta(){
    verifyOutput(RomanPrinter.print(21));
    verifyOutput(RomanPrinter.print(24));
    verifyOutput(RomanPrinter.print(25));
    verifyOutput(RomanPrinter.print(29));
    verifyOutput(RomanPrinter.print(30));
}

@Test
public void testPrintFinoAQuaranta(){
    verifyOutput(RomanPrinter.print(31));
    verifyOutput(RomanPrinter.print(34));
    verifyOutput(RomanPrinter.print(39));
    verifyOutput(RomanPrinter.print(40));
}

@Test
public void testPrintFinoACinquanta(){
    verifyOutput(RomanPrinter.print(41));
    verifyOutput(RomanPrinter.print(44));
    verifyOutput(RomanPrinter.print(45));
    verifyOutput(RomanPrinter.print(49));
    verifyOutput(RomanPrinter.print(50));
}

@Test
public void testPrintFinoASessanta(){
    verifyOutput(RomanPrinter.print(51));
    verifyOutput(RomanPrinter.print(54));
    verifyOutput(RomanPrinter.print(55));
    verifyOutput(RomanPrinter.print(59));
    verifyOutput(RomanPrinter.print(60));
}

@Test
public void testPrintFinoASettanta(){
    verifyOutput(RomanPrinter.print(61));
    verifyOutput(RomanPrinter.print(64));
    verifyOutput(RomanPrinter.print(65));
    verifyOutput(RomanPrinter.print(69));
    verifyOutput(RomanPrinter.print(70));
}

@Test
public void testPrintFinoAOttanta(){
    verifyOutput(RomanPrinter.print(71));
    verifyOutput(RomanPrinter.print(74));
    verifyOutput(RomanPrinter.print(75));
    verifyOutput(RomanPrinter.print(79));
    verifyOutput(RomanPrinter.print(80));
}

@Test
public void testPrintFinoANovanta(){
    verifyOutput(RomanPrinter.print(81));
    verifyOutput(RomanPrinter.print(84));
    verifyOutput(RomanPrinter.print(85));
    verifyOutput(RomanPrinter.print(89));
    verifyOutput(RomanPrinter.print(90));
}

@Test
public void testPrintFinoACento(){
    verifyOutput(RomanPrinter.print(91));
    verifyOutput(RomanPrinter.print(94));
    verifyOutput(RomanPrinter.print(95));
    verifyOutput(RomanPrinter.print(99));
    verifyOutput(RomanPrinter.print(100));
}

@Test
public void testPrintFinoACinquecento(){
    verifyOutput(RomanPrinter.print(400));
    verifyOutput(RomanPrinter.print(444));
    verifyOutput(RomanPrinter.print(500));
}
}