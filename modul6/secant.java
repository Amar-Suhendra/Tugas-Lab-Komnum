
/**
 * Class ini untuk mencari penyelesaian persamaan dengan metode Secant
 * dengan modifikasi tabel
 * 
 * @author Amar Suhendra
 * @version 02.11.21.Alpha-02S
 */
import java.util.Scanner;
import java.lang.Math;
public class secant {

  public static void menu() {
    System.out.println("+=============================+");
    System.out.println("|         List Jawaban        |");
    System.out.println("|         1. Soal no 1        |");
    System.out.println("|         2. Soal no 2        |");
    System.out.println("|         3. Soal no 3        |");
    System.out.println("+=============================+");
  }

  /**
   * mencari nilai f(x) = x*exp(-x)+sin(2*x)
   * 
   * @param x
   * @return hasil x*exp(-x)+sin(2*x)
   */
  public static double fungsi1(double x) {
    return x * Math.exp(-x) + Math.sin(2 * x);
  }

  /**
   * mencari nilai f(x) = cos(x+1)+exp(-x+2)
   * 
   * @param x
   * @return hasil cos(x+1)+exp(-x+2)
   */
  public static double fungsi2(double x) {
    return Math.cos(x + 1) + Math.exp(-x + 2);
  }

  /**
   * mencari nilai f(x) = cos(x)-sin(x)
   * 
   * @param x
   * @return hasil cos(x)-sin(x)
   */
  public static double fungsi3(double x) {
    return Math.cos(x) - Math.sin(x);
  }

  public static void main(String[] args) {
    Scanner pilihan = new Scanner(System.in);
    int pilih, N = 10, iterasi = 0;
    double x0, x1, y1, y2, y3, xn, e, abs;
    menu();
    System.out.print("Pilih jawaban yang ingin dilihat ( 1, 2, 3 ) : ");
    pilih = pilihan.nextInt();

    if (pilih == 1) {
      System.out.print("================ Soal 1 ================");
      System.out.printf("\nIterasi\t\txn\t\tf(xn)\n");
      e = 0.002;
      x0 = 1;
      x1 = 2.4;
      iterasi++;

      y3 = fungsi1(1.72704);
      abs = Math.abs(y3);
      System.out.printf("\n%f\n",y3);
      System.out.println(y3);
      
      // do {
      //   y1 = fungsi1(x0);
      //   y2 = fungsi1(x1);
      //   xn = x1 - (x1 - x0) * y2 / (y2 - y1);
      //   y3 = fungsi1(xn);
      //   x0 = x1;
      //   x1 = xn;
      //   System.out.println("println = " + y3 + " Xn = " + xn);
      //   System.out.printf("printf = %f   xn = %f\n",y3,xn);
      //   abs = Math.abs(y3);
      //   //System.out.println(abs);
      //   // System.out.printf("%d\t\t%.5f\t\t%.5f\n", iterasi,xn, y3);
      //   iterasi++;
      // } while (abs >= e && iterasi <= N);
    } else if (pilih == 2) {
      System.out.println("jawaban no 2");
    } else if (pilih == 3) {
      System.out.println("jawaban no 3");
    } else {
      System.out.println("Jawaban anda tidak valid");
    }
  }
}