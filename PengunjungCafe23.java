public class PengunjungCafe23 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
         daftarPengunjung("Ali", "Budi", "Citra");
    }
   
}