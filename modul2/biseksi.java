/**
 * @author Amar Suhendra
 */

import java.lang.Math;
public class biseksi {

  //mencari nilai dari F(x)
  public static double fungsi(Double x) {
    double hasil;

    //f(x) = x^3 - 10x + 8
    hasil = Math.pow(x, 3)-(10*x)+8;

    return hasil;
  }

  //mencari nilai Xr
  public static double exer(Double a, Double b){
    double hasil;
    // Xr = (a + b) / 2
    hasil = (a+b)/2;
    return hasil;
  }

  public static void main(String[] args) {
    double A = 2.4;   // xBawah
    double B = 2.7;   // xAtas
    double E = 0.02;  // Nilai toleransi error
    int N = 5;        // iterasi

    
  }

}
