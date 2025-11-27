package jobsheet11;

public class tugas3a {

    // Konstanta untuk ukuran array
    static String[] NAMA_MENU = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int JUMLAH_HARI = 7;
    static int JUMLAH_MENU = NAMA_MENU.length;

    static int[][] penjualan;

    public tugas3a() {
        this.penjualan = new int[JUMLAH_MENU][JUMLAH_HARI];
    }
   
    public void isianDataPenjualan() {
        int[][] dataTabel = {
            {20, 20, 25, 20, 10, 60, 10},  // Kopi
            {30, 80, 40, 10, 15, 20, 25},  // Teh
            {5, 9, 20, 25, 10, 5, 45},     // Es Kelapa Muda
            {50, 8, 17, 18, 10, 30, 6},    // Roti Bakar
            {15, 10, 16, 15, 10, 10, 55}   // Gorengan
        };

        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.arraycopy(dataTabel[i], 0, this.penjualan[i], 0, JUMLAH_HARI);
        }
        System.out.println("Data penjualan 5 menu x 7 hari berhasil diinputkan.");
    }

    public void tampilkanDataPenjualan() {
        System.out.println("\n--- REKAPITULASI PENJUALAN KAFI IBU MARIANA ---");
        
        System.out.print(String.format("%-18s", "Menu"));
        for (int j = 0; j < JUMLAH_HARI; j++) {
            System.out.print(String.format("| %-8s", "Hari ke " + (j + 1)));
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < JUMLAH_MENU; i++) {
            System.out.print(String.format("%-18s", NAMA_MENU[i]));
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print(String.format("| %-9s", this.penjualan[i][j]));
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public void tampilkanPenjualanTertinggi() {
        int maxTotal = -1;
        String menuTertinggi = "";

        System.out.println("\n--- PENJUALAN TERTINGGI SELAMA 7 HARI ---");

        for (int i = 0; i < JUMLAH_MENU; i++) {
            int totalPenjualanMenu = 0;
           
            for (int j = 0; j < JUMLAH_HARI; j++) {
                totalPenjualanMenu += this.penjualan[i][j];
            }

            if (totalPenjualanMenu > maxTotal) {
                maxTotal = totalPenjualanMenu;
                menuTertinggi = NAMA_MENU[i];
            }
        }

        System.out.println("Menu dengan total penjualan tertinggi:");
        System.out.println("Nama Menu: " + menuTertinggi );
        System.out.println("Total Penjualan: " + maxTotal + " unit");
    }

    public void tampilkanRataRataPenjualan() {
        System.out.println("\n--- RATA-RATA PENJUALAN PER MENU SELAMA 7 HARI ---");

        for (int i = 0; i < JUMLAH_MENU; i++) {
            int totalPenjualanMenu = 0;
           
            for (int j = 0; j < JUMLAH_HARI; j++) {
                totalPenjualanMenu += this.penjualan[i][j];
            }
            
            double rataRata = (double) totalPenjualanMenu / JUMLAH_HARI;

            System.out.println(String.format("%-18s", NAMA_MENU[i]) + ": " + String.format("%.2f", rataRata) + " unit/hari");
        }
    }

    public static void main(String[] args) {
        tugas3a rekap = new tugas3a();

        rekap.isianDataPenjualan();

        rekap.tampilkanDataPenjualan();

        rekap.tampilkanPenjualanTertinggi();

        rekap.tampilkanRataRataPenjualan();
    }
}