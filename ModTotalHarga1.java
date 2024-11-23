import java.util.Scanner;

public class ModTotalHarga1 {
public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
 
  if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
            hargaTotal *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode invalid, tidak ada pengurangan total harga.");
        }
        return hargaTotal;
}
 
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
    int pilihanMenu = sc.nextInt();
    System.out.print("Masukkan jumlah item yang ingin dipesan: ");
    int banyakItem = sc.nextInt();
    sc.nextLine();
    System.out.print("Masukkan kode promo (jika ada): ");
    String kodePromo = sc.nextLine();
    
    int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
    System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
     
 }

}