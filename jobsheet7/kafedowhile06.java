package jobsheet7;

import java.util.Scanner;

public class kafedowhile06 {
    Scanner input = new Scanner(System.in);

    int kopi; 
    int hargaKopi = 12000;
    int teh; 
    int hargaTeh = 7000; 
    int roti;
    int hargaRoti = 20000;
    int totalharga;
    String namapelanggan;

    do {
        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namapelanggan = input.nextLine();

        if(namapelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
        }
        System.out.println("Jumlah kopi: ");
        kopi = input.nextInt();
        System.out.println("Jumlah teh: ");
        teh = input.nextInt();
        System.out.println("Jumlah roti: ");
        roti = input.nextInt();
        totalharga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: Rp " + totalharga);
        input.nextLine();
    } while (true) ;

}
