
/**
 * Class ini untuk mencari penyelesaian persamaan dengan metode Secant
 * dengan modifikasi tabel
 * 
 * @author Amar Suhendra
 * @version 04.11.21.Alpha-04S
 */
import java.util.Scanner;
import java.lang.Math;

public class secant {
  static double xatas, xbawah;

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
  
  public static void batas1(double x0, double x1) {
    int N = 10;
    double h, xn, yn, xtemp, ftemp;

    h = (x1 - x0) / N;
    for (int i = 0; i <= N; i++) {
      xn = x0 + i * h;
      yn = fungsi1(xn);
      xtemp = x0 + (i + 1) * h;
      ftemp = fungsi1(xtemp);

      if (yn * ftemp < 0) {
        if (Math.abs(yn) < Math.abs(xtemp)) {
          xatas = xtemp;
          xbawah = xn;
        }
      }
    }
  }

  public static void batas2(double x0, double x1) {
    int N = 10;
    double h, xn, yn, xtemp, ftemp;

    h = (x1 - x0) / N;
    for (int i = 0; i <= N; i++) {
      xn = x0 + i * h;
      yn = fungsi2(xn);
      xtemp = x0 + (i + 1) * h;
      ftemp = fungsi2(xtemp);

      if (yn * ftemp < 0) {
        if (Math.abs(yn) < Math.abs(xtemp)) {
          xatas = xtemp;
          xbawah = xn;
        }
      }
    }
  }

  public static void batas3(double x0, double x1) {
    int N = 10;
    double h, xn, yn, xtemp, ftemp;

    h = (x1 - x0) / N;
    for (int i = 0; i <= N; i++) {
      xn = x0 + i * h;
      yn = fungsi3(xn);
      xtemp = x0 + (i + 1) * h;
      ftemp = fungsi3(xtemp);

      if (yn * ftemp < 0) {
        if (Math.abs(yn) < Math.abs(xtemp)) {
          xatas = xtemp;
          xbawah = xn;
        }
      }
    }
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
      batas1(x0, x1);
      x0 = xbawah;
      x1 = xatas;
      do {
        y1 = fungsi1(x0);
        y2 = fungsi1(x1);
        xn = x1 - (x1 - x0) * y2 / (y2 - y1);
        y3 = fungsi1(xn);
        System.out.printf("%d\t\t%.2f\t\t%.2f\n", iterasi,xn, y3);
        x0 = x1;
        x1 = xn;
        iterasi++;
        abs = Math.abs(y3);
      } while (abs > e && iterasi <= N);

    } else if (pilih == 2) {
      System.out.print("================ Soal 2 ================");
      System.out.printf("\nIterasi\t\txn\t\tf(xn)\n");
      e = 0.001;
      x0 = 1;
      x1 = 3;
      iterasi++;
      batas2(x0, x1);
      x0 = xbawah;
      x1 = xatas;
      do {
        y1 = fungsi2(x0);
        y2 = fungsi2(x1);
        xn = x1 - (x1 - x0) * y2 / (y2 - y1);
        y3 = fungsi2(xn);
        System.out.printf("%d\t\t%.2f\t\t%.2f\n", iterasi,xn, y3);
        x0 = x1;
        x1 = xn;
        iterasi++;
        abs = Math.abs(y3);
      } while (abs > e && iterasi <= N);
    } else if (pilih == 3) {
      System.out.print("================ Soal 2 ================");
      System.out.printf("\nIterasi\t\txn\t\tf(xn)\n");
      e = 0.001;
      x0 = 0;
      x1 = 2;
      iterasi++;
      batas3(x0, x1);
      x0 = xbawah;
      x1 = xatas;
      do {
        y1 = fungsi3(x0);
        y2 = fungsi3(x1);
        xn = x1 - (x1 - x0) * y2 / (y2 - y1);
        y3 = fungsi3(xn);
        System.out.printf("%d\t\t%.2f\t\t%.2f\n", iterasi,xn, y3);
        x0 = x1;
        x1 = xn;
        iterasi++;
        abs = Math.abs(y3);
      } while (abs > e && iterasi <= N);
    } else {
      System.out.println("Jawaban anda tidak valid");
    }
    pilihan.close();
  }
}