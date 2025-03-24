package UT1_TA3_Eje_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
<<<<<<< HEAD
import java.util.Arrays;
=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
>>>>>>> c1be8a3 (ej 10)

public class ContadorPalabras {

  public static int contarPalabras(String oracion) {
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

  public static void contarVocalesConsonantes(String frase) {
    String vocales = "aeiouáéíóú";
    frase = frase.toLowerCase();

    int contadorVocales = 0;
    int contadorConsonantes = 0;

    for (int i = 0; i < frase.length(); i++) {
      char letter = frase.charAt(i);
      if (Character.isLetter(letter)) {
        if (vocales.contains(String.valueOf(letter))) {
          contadorVocales++;
        } else {
          contadorConsonantes++;
        }
      }
    }

    System.out.println("Número de vocales: " + contadorVocales);
    System.out.println("Número de consonantes: " + contadorConsonantes);
  }

  public static void contarPalabrasConXDigitos(String oracion, int numeroDeLetras) {
    int contadorPalabras = 0;
    int contadorDeLetras = 0;
    for (int i = 0; i < oracion.length(); i++) {
      char caracter = oracion.charAt(i);
      if (Character.isLetterOrDigit(caracter)) {
        contadorDeLetras++;
        if (i == oracion.length() - 1) {
          if (contadorDeLetras > numeroDeLetras) {
            contadorPalabras++;
            contadorDeLetras = 0;
          }
        }
      } else if (i != 0 && Character.isLetterOrDigit(oracion.charAt(i - 1))) {
        if (contadorDeLetras > numeroDeLetras) {
          contadorPalabras++;
        }
        contadorDeLetras = 0;
      }
    }
    System.out.println(contadorPalabras);
  }

  public String[] obtenerLineas(String archivo) throws IOException {
    try {
      File file = new File(archivo);
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String linea = br.readLine();
      String[] lineas = new String[100];
      int contador = 0;
      while (linea != null) {
        lineas[contador] = linea;
        contador++;
        linea = br.readLine();
      }
      //return lineas;
<<<<<<< HEAD
      return Arrays.copyOfRange(lineas, 0 , contador);
=======
      return Arrays.copyOfRange(lineas, 0, contador);
>>>>>>> c1be8a3 (ej 10)
    } catch (FileNotFoundException e) {
      System.out.println("No se encontró el archivo");
      return null;
    }
  }

  public int cantPalabras(String[] lineasArchivo) {
    int contadorPalabras = 0;
    for (String linea : lineasArchivo) {
      contadorPalabras += contarPalabras(linea);
    }
    return contadorPalabras;
  }

  public static String[] palabrasComunes(String[] palabras1, String[] palabras2) {
    List<String> comunes = new ArrayList<>();

    for (String palabra1 : palabras1) {
      for (String palabra2 : palabras2) {
        if (palabra1.equals(palabra2)) {
          comunes.add(palabra1);
          break;
        }
      }
    }

    return comunes.toArray(new String[0]);
  }

}