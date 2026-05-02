////////////////////////////////////////////////////////////////////
// Matteo Cuogo 2111013
// Andrea Scantamburlo 2113201
// //////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number){
  String res = "";
    for(int i = 0; i < number; i++) {
        res += "I";
    }
  return res;
  }
}
