package jobsheet7;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tarif = 0;
        String kendaraan;
        int waktu;
       
        System.out.println("=== Program Pembayaran Tiket ===");
        System.out.println("Tolong taati peraturan dan antri"); 

       do {
            System.out.print("Masukkan kendaraan anda (ketik 'gagal' untuk keluar): ");
            kendaraan = input.nextLine();

            if(kendaraan.equalsIgnoreCase("motor")) {
                tarif = 2000;
            } else if (kendaraan.equalsIgnoreCase("mobil")){
                tarif = 3000;
            }else{
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan lama waktu parkir: ");
            waktu = input.nextInt();
            int tariftotal;
            tariftotal = waktu * tarif;
            if (waktu > 5){
                tariftotal = 12500;
            } else if (waktu <= 0){
                System.out.println("transaksi gagal");
                
            }
            System.out.println("Total yang harus dibayar: Rp " + tariftotal);
            input.nextLine();
        } while (true) ;
        System.out.println("Semua transaksi selesai.");
    }
}
