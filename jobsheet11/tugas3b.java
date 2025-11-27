package jobsheet11;

import java.util.Scanner;

public class tugas3b { 

    static int jumlahMenu;
    static int jumlahHari;
    static String[] namaMenu;
    static int[][] penjualan;
    static Scanner input;

    public tugas3b(Scanner penjualan) {
        this.input = penjualan;
    }

    public void isianDataPenjualanDinamis() {
        System.out.println("===== PENGATURAN DATA PENJUALAN DINAMIS =====");
        
        System.out.print("Masukkan jumlah menu (N): ");
        this.jumlahMenu = input.nextInt();
        
        System.out.print("Masukkan jumlah hari rekap: ");
        this.jumlahHari = input.nextInt();
        input.nextLine(); 

        this.namaMenu = new String[this.jumlahMenu];
        this.penjualan = new int[this.jumlahMenu][this.jumlahHari];
        
        System.out.println("\n--- Mengisi Nama Menu ---");

        for (int i = 0; i < this.jumlahMenu; i++) {
            System.out.print("Masukkan Nama Menu ke-" + (i + 1) + ": ");
            this.namaMenu[i] = input.nextLine();
        }
        
        System.out.println("\n--- Mengisi Data Penjualan Harian ---");

        for (int i = 0; i < this.jumlahMenu; i++) {
            System.out.println("Masukkan penjualan untuk menu **" + this.namaMenu[i] + "**:");
            for (int j = 0; j < this.jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " (unit): ");
                this.penjualan[i][j] = input.nextInt();
            }
        }
    }

    public void tampilkanDataPenjualanDinamis() {
        if (this.jumlahMenu == 0 || this.jumlahHari == 0) {
            System.out.println("\nData penjualan kosong.");
            return;
        }

        System.out.println("\n--- REKAPITULASI PENJUALAN KAFI DINAMIS ---");
        
        System.out.print(String.format("%-20s", "Menu"));
        for (int j = 0; j < this.jumlahHari; j++) {
            System.out.print(String.format("| %-10s", "Hari " + (j + 1)));
        }
        System.out.println();
        
        int lebarTabel = 20 + (this.jumlahHari * 12);
        for(int k=0; k < lebarTabel; k++) { System.out.print("-"); }
        System.out.println();

        for (int i = 0; i < this.jumlahMenu; i++) {
            System.out.print(String.format("%-20s", this.namaMenu[i]));
            for (int j = 0; j < this.jumlahHari; j++) {
                System.out.print(String.format("| %-10d", this.penjualan[i][j]));
            }
            System.out.println();
        }
        
        for(int k=0; k < lebarTabel; k++) { System.out.print("-"); }
        System.out.println();
    }

    public void tampilkanPenjualanTertinggiDinamis() {
        if (this.jumlahMenu == 0) return;

        int maxTotal = -1;
        String menuTertinggi = "";

        System.out.println("\n--- PENJUALAN TERTINGGI KESELURUHAN ---");

        for (int i = 0; i < this.jumlahMenu; i++) {
            int totalPenjualanMenu = 0;
            
            for (int j = 0; j < this.jumlahHari; j++) {
                totalPenjualanMenu += this.penjualan[i][j];
            }

            if (totalPenjualanMenu > maxTotal) {
                maxTotal = totalPenjualanMenu;
                menuTertinggi = this.namaMenu[i];
            }
        }

        System.out.println("Menu dengan total penjualan tertinggi:");
        System.out.println("Nama Menu: " + menuTertinggi );
        System.out.println("Total Penjualan: " + maxTotal + " unit");
    }

    public void tampilkanRataRataPenjualanDinamis() {
        if (this.jumlahHari == 0 || this.jumlahMenu == 0) return;

        System.out.println("\n--- RATA-RATA PENJUALAN PER MENU ---");

        for (int i = 0; i < this.jumlahMenu; i++) {
            int totalPenjualanMenu = 0;
            
            for (int j = 0; j < this.jumlahHari; j++) {
                totalPenjualanMenu += this.penjualan[i][j];
            }
            
            double rataRata = (double) totalPenjualanMenu / this.jumlahHari;

            System.out.println(String.format("%-20s", this.namaMenu[i]) + ": " + String.format("%.2f", rataRata) + " unit/hari");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tugas3b programDinamis = new tugas3b(scanner);

        programDinamis.isianDataPenjualanDinamis();

        programDinamis.tampilkanDataPenjualanDinamis();

        programDinamis.tampilkanPenjualanTertinggiDinamis();

        programDinamis.tampilkanRataRataPenjualanDinamis();
        
        scanner.close();
    }
}