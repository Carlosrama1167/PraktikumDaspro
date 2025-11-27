package jobsheet11;

import java.util.Scanner;

public class soal3kafe06 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      System.out.println("------------------------------");
       String nama1 = "Rama";
        boolean member1 = true;
        String promo1 = "DISKON50";
        
        menu(nama1, member1, promo1); 
        
        System.out.println("------------------------------");
        System.out.print("\n Masukkan nomor menu yang dipilih : ");
        int pilihanmenu = input.nextInt();

        System.out.print(" Masukkan banyak item yang dibeli : ");
        int banyakitem = input.nextInt();

        int totalharga = hitungtotalharga06(pilihanmenu, banyakitem);

        System.out.println(" Total harga yang harus dibayar (sebelum diskon): Rp " + totalharga);
        
        input.close();
    }
    public static void menu(String namapelanggan, boolean ismember, String kodepromo) {
        System.out.println("Selama datang, " + namapelanggan + "!");

        if (ismember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        } 
        
        if (kodepromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Dapatkan diskon tambahan 50%.");
        } else if (kodepromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Dapatkan diskon tambahan 30%.");
        }else {
            System.out.println("Kode promo tidak valid.");
        }

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
    public static int hitungtotalharga06(int pilihanmenu, int banyakitem){
        int[] hargaitems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargatotal = hargaitems[pilihanmenu - 1] * banyakitem;
        return hargatotal;
    }
}
