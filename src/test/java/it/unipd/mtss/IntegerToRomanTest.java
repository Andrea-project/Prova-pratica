////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class IntegerToRomanTest {
@Test
public void testPrimiTreNumeri() {
    assertEquals("I", IntegerToRoman.convert(1));
    assertEquals("II", IntegerToRoman.convert(2));
    assertEquals("III", IntegerToRoman.convert(3));
}
@Test
public void testPrimiSeiNumeri(){
    assertEquals("IV", IntegerToRoman.convert(4));
    assertEquals("V", IntegerToRoman.convert(5));
    assertEquals("VI", IntegerToRoman.convert(6));
}
@Test
public void testPrimiDieciNumeri(){
    assertEquals("VII", IntegerToRoman.convert(7));
    assertEquals("VIII", IntegerToRoman.convert(8));
    assertEquals("IX", IntegerToRoman.convert(9));
    assertEquals("X", IntegerToRoman.convert(10));
}
//da qua in poi dato i numeri sono tanti controllo solo i casi significativi
@Test
public void testPrimiVentiNumeri(){
    assertEquals("XI", IntegerToRoman.convert(11));
    assertEquals("XIV", IntegerToRoman.convert(14));
    assertEquals("XV", IntegerToRoman.convert(15));
    assertEquals("XVI", IntegerToRoman.convert(16));
    assertEquals("XIX", IntegerToRoman.convert(19));
    assertEquals("XX", IntegerToRoman.convert(20));
}

@Test
public void testFinoATrenta(){
    assertEquals("XXI", IntegerToRoman.convert(21));
    assertEquals("XXIV", IntegerToRoman.convert(24));
    assertEquals("XXV", IntegerToRoman.convert(25));
    assertEquals("XXIX", IntegerToRoman.convert(29));
    assertEquals("XXX", IntegerToRoman.convert(30));
}

@Test
public void testFinoAQuaranta(){
    assertEquals("XXXI", IntegerToRoman.convert(31));
    assertEquals("XXXIV", IntegerToRoman.convert(34));
    assertEquals("XXXIX", IntegerToRoman.convert(39));
    assertEquals("XL", IntegerToRoman.convert(40));
}

@Test
public void testFinoACinquanta(){
    assertEquals("XLI", IntegerToRoman.convert(41));
    assertEquals("XLIV", IntegerToRoman.convert(44));
    assertEquals("XLV", IntegerToRoman.convert(45));
    assertEquals("XLIX", IntegerToRoman.convert(49));
    assertEquals("L", IntegerToRoman.convert(50));
}

@Test
public void testFinoASessanta(){
    assertEquals("LX", IntegerToRoman.convert(60));
    assertEquals("LXIV", IntegerToRoman.convert(64));
    assertEquals("LXIX", IntegerToRoman.convert(69));
}

@Test
public void testFinoAOttanta(){
    assertEquals("LXX", IntegerToRoman.convert(70));
    assertEquals("LXXV", IntegerToRoman.convert(75));
    assertEquals("LXXX", IntegerToRoman.convert(80));
}

@Test
public void testFinoACento(){
    assertEquals("LXXXIX", IntegerToRoman.convert(89));
    assertEquals("XC", IntegerToRoman.convert(90));
    assertEquals("XCIV", IntegerToRoman.convert(94));
    assertEquals("XCIX", IntegerToRoman.convert(99));
    assertEquals("C", IntegerToRoman.convert(100));
}

//non testiamo tutto altrimenti sono altre 200 assert

@Test
public void testFinoAQuattrocento(){
    assertEquals("CC", IntegerToRoman.convert(200));
    assertEquals("CCC", IntegerToRoman.convert(300));
    assertEquals("CD", IntegerToRoman.convert(400));
}

@Test
public void testFinoACinquecento(){
    assertEquals("CDXCIX", IntegerToRoman.convert(499));
    assertEquals("D", IntegerToRoman.convert(500));
}

}