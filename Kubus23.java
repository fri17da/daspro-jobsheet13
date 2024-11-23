import java.util.Scanner;
public class Kubus23 {
    static int hitungLuas (int sisi) {
        return 6 * (sisi * sisi);
    }
     static int hitungVolume (int sisi) {
        return sisi * sisi * sisi;
    }
     public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int sisi, luas, volume;
        System.out.println("Masukkan sisi ");
        sisi=input.nextInt();
        
        luas=hitungLuas(sisi);
        System.out.println("Luas permukaan kubus adalah "+luas);
        volume=hitungVolume(sisi);
        System.out.println("Volume Balok adalah "+volume);
    }
}