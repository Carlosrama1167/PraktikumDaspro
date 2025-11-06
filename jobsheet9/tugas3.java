package jobsheet9;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] makanan = {"nasi goreng", "mie goreng", "roti bakar", "kentang goreng", "teh tarik", "capucino", "chocolato ice"};


        System.out.println("---- Daftar makanan/minuman di warung kami ----");

        for (String item : makanan) {
            System.out.println( " - : " + item);
            
        }
        System.out.print("Masukkan makanan yang di cari: ");
        String key = input.nextLine();

        boolean found = false;
        int index = -1;
        for (int i = 0; i < makanan.length; i++) {
           if (key.equalsIgnoreCase(makanan[i])) {
                 found = true;
                 index = i;
                break;  
           }
        }
        System.out.println("\n---- Hasil pencariian ----");
        if (found) {
            System.out.println("Makanan " + key + " ditemukan di indeks ke-" + index);
            System.out.println("makanan/minuman " + key + " tersedia di warung kami");
        } else {
            System.out.println("Makanan " + key + " tidak ditemukan");
        }
        
        System.out.println();
        
    }
}
