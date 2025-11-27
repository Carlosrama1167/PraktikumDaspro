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
        
        System.out.println("\n[APLIKASI DISKON PROMO]");

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
        } else if (!kodePromo.isEmpty()) { 
            System.out.println("Kode promo '" + kodePromo + "' tidak valid. Tidak ada pengurangan harga.");
        }
        
        int totalHargaAkhir = totalHargaAwal - (int)jumlahDiskonRupiah;
        return totalHargaAkhir;
    }
    
    public static void menu(String namapelanggan, boolean ismember, String kodepromo) {
        System.out.println("Selamat datang, " + namapelanggan + "!");

        if (ismember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% tambahan (dihitung di total akhir).");
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
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String namaPelanggan = "Rama";
        boolean isMember = true;
        String kodePromoPelanggan = "DISKON50"; 
        char tambahLagi;
        
        int totalHargaKeseluruhan = 0; 

        menu(namaPelanggan, isMember, kodePromoPelanggan);
        
        System.out.println("------------------------------");

        do {
            System.out.print("\nMasukkan nomor menu yang dipilih (1-6): ");
            int pilihanmenu = input.nextInt();
            
            System.out.print("Masukkan banyak item yang dibeli : ");
            int banyakitem = input.nextInt();

            int hargaItemSaatIni = hitungtotalharga06(pilihanmenu, banyakitem);
            
            totalHargaKeseluruhan += hargaItemSaatIni; 

            System.out.println("Subtotal item ini: Rp " + hargaItemSaatIni);

            System.out.print("Apakah Anda ingin menambah pesanan lagi? (y/t): ");
            tambahLagi = input.next().charAt(0);
            
        } while (tambahLagi == 'y' || tambahLagi == 'Y');
        
        System.out.println("==============================");
        System.out.println("TOTAL HARGA MENTAH KESELURUHAN: Rp " + totalHargaKeseluruhan);
        
        int totalHargaFinalSetelahPromo = hitungTotalHargaDiskon06(totalHargaKeseluruhan, kodePromoPelanggan);
        
        System.out.println("------------------------------");
        System.out.println("TOTAL AKHIR YANG HARUS DIBAYAR: Rp " + totalHargaFinalSetelahPromo);
        System.out.println("==============================");
        
        input.close(); 
    }
}