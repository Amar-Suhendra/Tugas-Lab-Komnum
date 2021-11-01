/**
 * Class ini untuk mencari penyelesaian persamaan dengan metode Secant
 * dengan modifikasi tabel
 * 
 * @author Amar Suhendra
 * @version 01.11.21.Alpha-01S
 */
import java.util.Scanner;

public class secant {

  public static void menu() {
    System.out.println("+=============================+");
    System.out.println("|         List Jawaban        |");
    System.out.println("|         1. Soal no 1        |");
    System.out.println("|         2. Soal no 2        |");
    System.out.println("|         3. Soal no 3        |");
    System.out.println("+=============================+");
  }

  public double fungsi1(double x){
    // f(x) = x*exp(-x)+sin(2*x) 
    return x * Math.exp(-x) + Math.sin(2*x);
  }

  public double fungsi2(double x){
    // f(x) = cos(x+1)+exp(-x+2) 
    return Math.cos(x+1) + Math.exp(-x+2);
  }

  public double fungsi3(double x){
    // f(x) = cos(x)-sin(x) 
    return Math.cos(x) - Math.sin(x);
  }

  public static void main(String[] args) {
    Scanner pilihan = new Scanner(System.in);
    int pilih;
    menu();
    System.out.print("Pilih jawaban yang ingin dilihat ( 1, 2, 3 ) : ");
    pilih = pilihan.nextInt();

    if (pilih == 1) {
      System.out.println("jawaban no 1");
    } else if (pilih == 2) {
      System.out.println("jawaban no 2");
    } else if (pilih == 3) {
      System.out.println("jawaban no 3");
    } else {
      System.out.println("Jawaban anda tidak valid");
    }
  }
}