package jobsheet9;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("   Sistem Pemesanan Kafe sederhana   ");
        System.out.println("=====================================");
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahpesanan = input.nextInt();

        input.nextLine();

        String[] namamenu = new String[jumlahpesanan];
        int[] hargamenu = new int[jumlahpesanan];

        int totalharga=0;

        System.out.println("\n--- masukkan detail pesanan ---");
        for (int i = 0; i < jumlahpesanan; i++) {
            System.out.println("\npesanan ke-" + (i + 1));

            System.out.print("nama makanan/minuman: ");
            namamenu[i] = input.nextLine();

            System.out.print("harga menunya: ");
            hargamenu[i] = input.nextInt();

            totalharga += hargamenu[i];

            input.nextLine();
        }

        System.out.println("\n==================================");
        System.out.println("          DAFTAR PESANAN          ");
        System.out.println("==================================");
        
        System.out.printf("%-5s | %-25s | %-10s\n", "No.", "Nama Pesanan", "Harga (Rp)");
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < jumlahpesanan; i++) {
            System.out.printf("%-5d | %-25s | %-10d\n", (i + 1), namamenu[i], hargamenu[i]);
        }
        
        System.out.println("----------------------------------------------");
        System.out.printf("%-33s | %-10d\n", "TOTAL BIAYA KESELURUHAN", totalharga);
        System.out.println("==================================");

        input.close();
    }
}
