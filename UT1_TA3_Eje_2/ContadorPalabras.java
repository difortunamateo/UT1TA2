package UT1_TA3_Eje_2;

public class ContadorPalabras {

  public int contarPalabras(String oracion) {
    int contadorPalabras = 0;
    for (int i = 0; i < oracion.length(); i++) {
      char caracter = oracion.charAt(i);
      boolean esPalabra = false;
      if (Character.isLetter(caracter)) {
        esPalabra = true;
        if (i == oracion.length() - 1) {
          contadorPalabras++;
        }
      } else if (i != 0 && Character.isLetter(oracion.charAt(i - 1))) {
        esPalabra = false;
        contadorPalabras++;
      }
    }
    return contadorPalabras;
  }
}