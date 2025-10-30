package jobsheet8;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cabang;
        int pelanggan;
        int item;

        
        float jumlahitem = 0;
        float jumlahpelanggan = 0;

        System.out.print("jumlah cabang kafe = ");
        cabang = input.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");

        int i = 1;
        while(i <= cabang){
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            pelanggan = input.nextInt();
            
            float totalitem = 0;

            jumlahpelanggan += pelanggan;
           for (int j = 1; j<=pelanggan; j++){
                System.out.print("- Pelanggan " + j + " memesan berapa item? " );
                item = input.nextInt();
                totalitem += item;
            }
            jumlahitem += totalitem;
            System.out.println("Cabang " + i + " :");
            System.out.println("- Pelanggan : " + pelanggan + " orang");
            System.out.println("- item terjual : " + totalitem );
            i++;
        }
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("pelanggan : " + jumlahpelanggan + " orang");
        System.out.println("Item Terjual : " + jumlahitem + " Item");
        input.close();
    }
}
