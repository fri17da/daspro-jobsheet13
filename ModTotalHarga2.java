import java.util.Scanner;

public class ModTotalHarga2 {
    public static double hitungTotalHarga(double hargaTotal, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7; 
        } else if (kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hargaItems = {15000, 20000, 22000, 10000, 18000};
        String[] namaMenu = {"Nasi Goreng", "Mie Ayam", "Seblak", "Sate", "Soto"};
        int[] jumlahPesanan = new int[hargaItems.length]; 
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
        
        boolean selesai = false;
        while (!selesai) {
            System.out.println("\nDaftar Menu:");
            for (int i = 0; i < namaMenu.length; i++) {
                System.out.println((i + 1) + ". " + namaMenu[i] + " Rp" + hargaItems[i]);
            }
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-5): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu < 1 || pilihanMenu > 5) {
                System.out.println("Menu tidak valid. Silakan masukkan nomor menu antara 1-5.");
                continue;
            }
            System.out.print("Masukkan jumlah item untuk menu ini: ");
            jumlahPesanan[pilihanMenu - 1] = sc.nextInt();

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            sc.nextLine(); 
            String pilihan = sc.nextLine();
            if (pilihan.equalsIgnoreCase("n")) {
                selesai = true;
            }
        }
        double totalHarga = 0;
        System.out.println("\nDetail Pesanan:");
        for (int i = 0; i < namaMenu.length; i++) {
            if (jumlahPesanan[i] > 0) {
                int hargaItem = hargaItems[i];
                int jumlah = jumlahPesanan[i];
                double subtotal = hargaItem * jumlah;
                totalHarga += subtotal; 
                System.out.println(namaMenu[i] + " x " + jumlahPesanan[i] + " = Rp" + subtotal);
            }
        }
        double hargaAkhir = hitungTotalHarga(totalHarga, kodePromo);
        System.out.println("\nTotal harga keseluruhan: Rp" + hargaAkhir);
    }
}
