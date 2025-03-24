package UT1_TA3_Eje_2;

import java.io.IOException;
import java.util.Arrays;
<<<<<<< HEAD
=======
import java.util.Random;
>>>>>>> c1be8a3 (ej 10)

public class Principal {

  public static void main(String[] args) throws IOException {
    ContadorPalabras cp = new ContadorPalabras();
    System.out.println(Arrays.toString(cp.obtenerLineas("UT1_TA3_Eje_2/UT1_TA3_ARCHIVO_EJEMPLO.txt")));
<<<<<<< HEAD
    System.out.println(Arrays.toString(cp.obtenerLineas("UT1_TA3_Eje_2/hola.txt")));
    System.out.println(cp.cantPalabras(cp.obtenerLineas("UT1_TA3_Eje_2/UT1_TA3_ARCHIVO_EJEMPLO.txt")));
    System.out.println(cp.cantPalabras(cp.obtenerLineas("UT1_TA3_Eje_2/hola.txt")));
=======
    //System.out.println(Arrays.toString(cp.obtenerLineas("UT1_TA3_Eje_2/hola.txt")));
    System.out.println(cp.cantPalabras(cp.obtenerLineas("UT1_TA3_Eje_2/UT1_TA3_ARCHIVO_EJEMPLO.txt")));
    //System.out.println(cp.cantPalabras(cp.obtenerLineas("UT1_TA3_Eje_2/hola.txt")));
    try {
      String[] lineas = cp.obtenerLineas("UT1_TA3_Eje_2/UT1_TA3_ARCHIVO_EJEMPLO.txt");
      if (lineas == null || lineas.length < 2) {
        System.out.println("El archivo debe contener al menos dos líneas.");
        return;
      }

      Random random = new Random();
      String[] palabras1 = lineas[random.nextInt(lineas.length)].split(" ");
      String[] palabras2 = lineas[random.nextInt(lineas.length)].split(" ");

      System.out.println("Palabras comunes: " + Arrays.toString(cp.palabrasComunes(palabras1, palabras2)));
    } catch (IOException e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
>>>>>>> c1be8a3 (ej 10)
  }

}