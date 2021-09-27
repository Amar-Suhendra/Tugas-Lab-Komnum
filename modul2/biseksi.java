
/**
 * @author Amar Suhendra
 */

import java.lang.Math;

public class biseksi {

  // mencari nilai dari F(x)
  public static double fungsi(Double x) {
    double hasil;

    // f(x) = x^3 - 10x + 8
    hasil = Math.pow(x, 3) - (10 * x) + 8;

    return hasil;
  }

  // mencari nilai Xr
  public static double exer(Double a, Double b) {
    double hasil;
    // Xr = (a + b) / 2
    hasil = (a + b) / 2;
    return hasil;
  }

  public static void main(String[] args) {
    double A = 2.4; // xBawah
    double B = 2.7; // xAtas
    double E = 0.02; // Nilai toleransi error
    int N = 5, iterasi = 0; // iterasi
    double hasilA, hasilB, hasilXr = 0, hasilfxr = 0, absA, absB;
    boolean kondisi = true;
    hasilA = fungsi(A);
    hasilB = fungsi(B);

    if (hasilA * hasilB > 0) {
      System.out.println("Tidak ada akar");
    } else {
      while (kondisi) {
        iterasi++;
        hasilXr = exer(A, B);
        hasilfxr = fungsi(hasilXr);
        absA = Math.abs(A);
        absB = Math.abs(B);

        if (absB - absA < E || iterasi > N) {
          kondisi = false;
        } else {

          if (hasilA * hasilfxr < 0) {
            B = hasilXr;
            hasilB = hasilfxr;
          } else {
            A = hasilXr;
            hasilA = hasilfxr;
          }

        }

      }
      System.out.println("Akar xr : " + Math.sqrt(hasilXr) + " dan F(Xr) : " + hasilfxr);
    }
  }

}
