package TA2;

public class UtilMath {

  public static void main(String[] args) {
    sum(9);
  }

  public static void sum(int num){
    int i = 0;
    int sumPares = 0;
    int sumImpares = 0;
    if (isPrime(num)){
      while (i <= num){
        if(i % 2 == 0){
          sumPares += i;
        }
        i++;
      }
    } else {
      while (i <= num){
        if(i % 2 != 0){
          sumImpares += i;
        }
        i++;
      }
    };
    if (sumPares != 0) System.out.println("La suma de los números pares es: " + sumPares);
    if (sumImpares != 0) System.out.println("La suma de los números impares es: " + sumImpares);
  }

  public static boolean isPrime(long n) {
    boolean prime = true;
    for (long i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        prime = false;
        break;
      }
    }
    if ((n % 2 != 0 && prime && n > 2) || n == 2) {
      return true;
    } else {
      return false;
    }
  }

}
