package jobsheet7;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Htiket = 50000;
        double tiket;
        double ttiket = 0;
        double tpembayaran = 0;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Harga per tiket: Rp " + Htiket); // Menampilkan harga per tiket

        while (true){
            System.out.print("Masukkan jumlah tiket ke-: ");
            tiket = input.nextDouble();

            if ( tiket < 0 ){
                System.out.println("nilai tidak valid. masukkan lagi nilai yang valid!");
                continue;   
            }
            if (tiket > 4 && tiket <= 10) {
                System.out.println("pelanggan mendapatkan diskon 10%");
            } else if (tiket > 10 ) {
                System.out.println("pelanggan mendapatkan diskon 15%");
            } else {
                System.out.println("pelanggan tidak mendapatkan diskon");
            }
            if (tiket == 0) {
                System.out.println("\nPenjualan selesai.");
                break;
            }
            double hSebelumDiskon = tiket * Htiket;
            double diskonPersen = 0;

            if (tiket > 10) {
                diskonPersen = 0.15; 
            } else if (tiket > 4) {
                diskonPersen = 0.10; 
            }

            double hSetelahDiskon = hSebelumDiskon *  diskonPersen;

            ttiket += tiket;
            tpembayaran += hSetelahDiskon;

            System.out.println("Detail Transaksi:");
            System.out.println("  Jumlah tiket dibeli: " + tiket);
            System.out.printf("  Diskon yang didapat: %.0f%%\n", diskonPersen * 100); 
            System.out.printf("  Harga transaksi ini: Rp %,.0f\n", hSetelahDiskon);

        }  
        System.out.println("\n--- Rekapitulasi Penjualan Harian ---");
        System.out.println("Total tiket terjual: " + ttiket + " tiket");
        System.out.printf("Total harga penjualan: Rp %,.0f\n", tpembayaran); 

        input.close();
    }
}
