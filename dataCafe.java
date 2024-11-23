import java.util.Scanner;

public class dataCafe {

    static int[][] salesData;
    static String[] menu;
    static int jumlahHari;
    static int jumlahMenu;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = sc.nextInt();

        salesData = new int[jumlahMenu][jumlahHari];
        menu = new String[jumlahMenu];

        sc.nextLine();
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
    
        int choice;
        do { 
            System.out.println("\nPilih menu:");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan seluruh data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan untuk setiap menu");
            System.out.println("Keluar");
            
            System.out.print("Masukkan pilihan: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputPenjualan(sc);
                    break;
                case 2:
                    tampilkanDataPenjualan();
                    break;
                case 3:
                    tampilkanMenuTertinggi();
                    break;
                case 4:
                    tampilkanRata2Penjualan();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (choice != 5);
    }

        public static void inputPenjualan(Scanner sc) {
            System.out.println("\nMasukkan data penjualan untuk setiap menu (selama " + jumlahHari + "hari):");
            for (int i = 0; i < jumlahMenu; i++) {
                System.out.println("Masukkan penjualan untuk menu " + menu[i] + ":");
                for (int j = 0; j < jumlahHari; j++) {
                    System.out.print("Hari ke-" + (j + 1) + ": ");
                    salesData[i][j] = sc.nextInt();
                }
            }
        }
        public static void tampilkanDataPenjualan() {
            System.out.println("\nData penjualan per menu: ");
            for (int i = 0; i < jumlahMenu; i++) {
                System.out.print(menu[i] + ": ");
                for (int j = 0; j < jumlahHari; j++) {
                    System.out.print(salesData[i][j] + " ");
                }
                System.out.println();
            }
        }
       public static void tampilkanMenuTertinggi() {
             int maxSales = 0;
             String bestMenu = "";
             for (int i = 0; i < jumlahMenu; i++) {
                int totalSales = 0;
                for (int j = 0; j < jumlahHari; j++) {
                    totalSales += salesData[i][j];
                }
                if (totalSales > maxSales) {
                    maxSales = totalSales;
                    bestMenu = menu[i];
                }
             }
            System.out.println("Menu dengan penjualan tertinggi adalah " + bestMenu + " dengan total penjualan " + maxSales);
       }
       public static void tampilkanRata2Penjualan() {
            System.out.println("\nRata-rata penjualan per menu:");
            for (int i = 0; i < jumlahMenu; i++) {
                int totalSales = 0;
                for (int j = 0; j < jumlahHari; j++) {
                    totalSales += salesData[i][j];
                }
                double avgSales = totalSales / (double) jumlahHari;
                System.out.println(menu[i] + ": " + avgSales);
            }
        }
    }
