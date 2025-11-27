package jobsheet11;

import java.util.Scanner;

public class soal3kafe06 {
    
    public static int hitungtotalharga06(int pilihanmenu, int banyakitem) {
        int[] hargaitems = {15000, 20000, 22000, 12000, 10000, 18000}; 

        if (pilihanmenu >= 1 && pilihanmenu <= hargaitems.length) {
            int hargatotal = hargaitems[pilihanmenu - 1] * banyakitem;
            return hargatotal;
        } else {
            return 0; 
        }
    }

    public static int hitungTotalHargaDiskon06(int totalHargaAwal, String kodePromo) {
        double diskon = 0; 
        double jumlahDiskonRupiah = 0;
        
        System.out.println("\n[PROMO APLIKASI]");

        if (kodePromo.equals("DISKON50")) {
            diskon = 0.50; 
            jumlahDiskonRupiah = totalHargaAwal * diskon;
            System.out.println("Kode Promo: DISKON50 - Diskon 50% Diterapkan!");
            System.out.println("Diskon yang Anda dapatkan: Rp " + (int)jumlahDiskonRupiah);
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.30; 
            jumlahDiskonRupiah = totalHargaAwal * diskon;
            System.out.println("Kode Promo: DISKON30 - Diskon 30% Diterapkan!");
            System.out.println("Diskon yang Anda dapatkan: Rp " + (int)jumlahDiskonRupiah);
        } else {
            System.out.println("Kode promo '" + kodePromo + "' tidak valid. Tidak ada pengurangan harga.");
        }
        
        int totalHargaAkhir = totalHargaAwal - (int)jumlahDiskonRupiah;
        return totalHargaAkhir;
    }

    public static void menu(String namapelanggan, boolean ismember, String kodepromo) {
        System.out.println("Selamat datang, " + namapelanggan + "!");

        if (ismember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian (dihitung di kasir).");
        } 
        
        System.out.println("------------------------------");
        System.out.println("====== Menu Resto Kafe ======");
        System.out.println("1. Kopi Hitama - Rp 15.000");
        System.out.println("2. Capuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String namaPelanggan = "Rama";
        boolean isMember = true;
        String kodePromoPelanggan = "DISKON50"; 
        
        menu(namaPelanggan, isMember, kodePromoPelanggan); 
        
        System.out.println("------------------------------");
        System.out.print("\n Masukkan nomor menu yang dipilih (1-6): ");
        int pilihanmenu = input.nextInt();

        System.out.print(" Masukkan banyak item yang dibeli : ");
        int banyakitem = input.nextInt();
      
        int totalHargaAwal = hitungtotalharga06(pilihanmenu, banyakitem);
        
        System.out.println("------------------------------");
        System.out.println(" Total harga sebelum diskon: Rp " + totalHargaAwal);
        
        int totalHargaFinal = hitungTotalHargaDiskon06(totalHargaAwal, kodePromoPelanggan);

        System.out.println("\n Total harga yang harus dibayar : Rp " + totalHargaFinal);
        System.out.println("------------------------------");
        
        input.close(); 
    }
}