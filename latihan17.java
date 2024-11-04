import java.util.Scanner;

public class latihan17 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Masukkan gaji pokok: Rp ");
      double gajiPokok = input.nextDouble();

      System.out.print("Apakah Anda sudah menikah? (ya/tidak): ");
      String statusMenikah = input.next();

      double tunjangan = 0;

      if (statusMenikah.equalsIgnoreCase("ya")) {
        tunjangan = 0.35 * gajiPokok;
      }

      double totalGaji = gajiPokok + tunjangan;

      System.out.println("Gaji Pokok: Rp " + gajiPokok);
      System.out.println("Tunjangan: Rp " + tunjangan);
      System.out.println("Total Gaji: Rp " + totalGaji);
    }
  }
}
