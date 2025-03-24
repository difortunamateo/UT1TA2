package UT1_TA3_Eje_2;

public class Principal {

  public static void main(String[] args) {
    ContadorPalabras cp = new ContadorPalabras();
    cp.contarPalabras("Hola mundo");
    cp.contarVocalesConsonantes("ñññññ");
    cp.contarPalabrasConXDigitos("oracion", 10);
  }

}
