package UT1_TA3_Eje_2;

import java.io.IOException;
import java.util.Arrays;

public class Principal {

  public static void main(String[] args) throws IOException {
    ContadorPalabras cp = new ContadorPalabras();
    System.out.println(Arrays.toString(cp.obtenerLineas("UT1_TA3_Eje_2/UT1_TA3_ARCHIVO_EJEMPLO.txt")));
    System.out.println(Arrays.toString(cp.obtenerLineas("UT1_TA3_Eje_2/hola.txt")));
    System.out.println(cp.cantPalabras(cp.obtenerLineas("UT1_TA3_Eje_2/UT1_TA3_ARCHIVO_EJEMPLO.txt")));
    System.out.println(cp.cantPalabras(cp.obtenerLineas("UT1_TA3_Eje_2/hola.txt")));
  }

}
