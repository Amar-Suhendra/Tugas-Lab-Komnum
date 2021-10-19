/**
 * NewtonRaphson
 */
import java.lang.Math;

public class NewtonRaphson {

  public static double Per1(Double x) {
    double hasil;
    hasil = (4 * Math.pow(x, 3) )- (15 * Math.pow(x, 2)) + (17 * x) - 6;
    return hasil;
  }

  public static double Per1T(Double x){
    double hasil;
    hasil = (12 * Math.pow(x, 2)) - (30 * x) + 17;
    return hasil;
  }

  public static void main(String[] args) {
    int N = 10, iterasi;
    double e = 0.001, y1, y2, xn, x0 = 3.0, absA;

    System.out.print("========================= Soal 1 =========================");
    System.out.printf("\nIterasi\t\txn\t\tf(xn)\t\tf'(xn)\n");
    iterasi = 0;
    xn = x0;
    y1 = Per1(x0);
    y2 = Per1T(x0);
    xn = xn-(y1/y2);
    System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", iterasi, xn, y1, y2);

    absA = Math.abs(y1);
    while (absA >= e && iterasi <= N) {
      iterasi ++;
      y1 = Per1(xn);
      y2 = Per1T(xn);
      xn = xn-(y1/y2);
      absA = Math.abs(y1);
      System.out.printf("%d\t\t%.5f\t\t%.5f\t\t%.5f\n", iterasi, xn, y1, y2);
    }
    System.out.print("==========================================================");
  }
}