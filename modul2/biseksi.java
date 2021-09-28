/**
 * @author Amar Suhendra
 * @version 28.09.21.1.2
 * https://github.com/Amar-Suhendra/Tugas-Lab-Komnum
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
    double A = 2.4;         // xBawah
    double B = 2.7;         // xAtas
    double E = 0.02;        // Nilai toleransi error
    int N = 5, iterasi = 0; // iterasi
    double hasilA;          //menampung f(a)
    double hasilB;          //menampung f(b)
    double hasilXr = 0;     //menampung Xr
    double hasilfxr = 0;    //menampung f(Xr)
    double absA;            //menampung nilai absolut A
    double absB;            //menampung nilai absolut B
    boolean kondisi = true;
    
    hasilA = fungsi(A); //f(a) = a^3 - 10a + 8
    hasilB = fungsi(B); //f(b) = b^3 - 10b + 8

    //jika f(a).f(b) > 0, maka
    if (hasilA * hasilB > 0) { 
      //true
      //tidak ada akar              
      System.out.println("Tidak ada akar"); 
    } else { 
      //false
      //mempunyai akar
      while (kondisi) { 
        //iterasi +1
        iterasi++; 

        hasilXr = exer(A, B);       // Xr = (a + b)/2
        hasilfxr = fungsi(hasilXr); // f(Xr) = Xr^3 - 1

        absA = Math.abs(A); // |a|
        absB = Math.abs(B); // |b|

        if (absB - absA < E || iterasi > N) { // |a-b| < e atau iterasi > iterasi maksimum
          //keluar dari loop
          kondisi = false;
        } else {
          // kondisi = true
          if (hasilA * hasilfxr < 0) { // jika f(a).f(Xr) < 0
            // true
            B = hasilXr;       // b = xr
            hasilB = hasilfxr; // f(b) = f(Xr) 
          } else {
            //false
            A = hasilXr;        // a = xr
            hasilA = hasilfxr;  // f(a) = f(Xr)
          }

        }

      }
      //mencetak akar dari Xr dan f(Xr)
      System.out.println("Akar xr : " + Math.sqrt(hasilXr) + " dan F(Xr) : " + hasilfxr);
    }
  }

}
