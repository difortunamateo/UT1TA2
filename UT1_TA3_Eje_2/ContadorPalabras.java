package UT1_TA3_Eje_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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
      return Arrays.copyOfRange(lineas, 0 , contador);
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

}