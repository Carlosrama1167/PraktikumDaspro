package jobsheet7;

import java.util.Scanner; // Mengimpor kelas Scanner untuk menerima input dari pengguna

public class Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner
        double hargaPerTiket = 50000; // Harga satu tiket
        int totalTiketTerjual = 0; // Variabel untuk menyimpan total tiket yang terjual
        double totalHargaPenjualan = 0; // Variabel untuk menyimpan total harga penjualan

        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Harga per tiket: Rp " + hargaPerTiket); // Menampilkan harga per tiket

        // Menggunakan perulangan 'for' yang berfungsi sebagai perulangan tanpa batas
        // Program akan berhenti ketika pengguna memasukkan 0 untuk jumlah tiket.
        for (;;) { // Sintaks for (;;) membuat perulangan berjalan terus-menerus
            int jumlahTiket;
            
            // Perulangan untuk mendapatkan input jumlah tiket yang valid
            while (true) {
                System.out.print("\nMasukkan jumlah tiket yang dibeli pelanggan (0 untuk selesai): ");
                
                // Memeriksa apakah input yang diberikan adalah angka
                if (input.hasNextInt()) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    input.next(); // Mengkonsumsi input yang tidak valid
                    continue; // Melanjutkan ke iterasi berikutnya untuk meminta input ulang
                }
                
                jumlahTiket = input.nextInt(); // Membaca jumlah tiket yang dimasukkan

                // Jika pengguna memasukkan 0, ini berarti penjualan selesai
                if (jumlahTiket == 0) {
                    break; // Keluar dari perulangan input
                }
                
                // Validasi input negatif
                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid (negatif). Silakan masukkan ulang.");
                    continue; // Melanjutkan ke iterasi berikutnya untuk meminta input ulang
                }
                // Jika input valid (positif), keluar dari perulangan input
                break; 
            }

            // Jika jumlahTiket adalah 0, ini menandakan akhir penjualan hari itu
            if (jumlahTiket == 0) {
                System.out.println("\nPenjualan selesai.");
                break; // Keluar dari perulangan utama (penjualan harian)
            }

            // Menghitung harga transaksi sebelum diskon
            double hargaTransaksiSebelumDiskon = jumlahTiket * hargaPerTiket;
            double diskonPersen = 0; // Variabel untuk menyimpan persentase diskon

            // Menerapkan diskon berdasarkan jumlah tiket
            if (jumlahTiket > 10) {
                diskonPersen = 0.15; // Diskon 15% jika lebih dari 10 tiket
            } else if (jumlahTiket > 4) {
                diskonPersen = 0.10; // Diskon 10% jika lebih dari 4 tiket (dan tidak lebih dari 10)
            }

            // Menghitung harga transaksi setelah diskon
            double hargaTransaksiSetelahDiskon = hargaTransaksiSebelumDiskon * (1 - diskonPersen);

            // Menambahkan jumlah tiket dan harga transaksi ke total harian
            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += hargaTransaksiSetelahDiskon;

            // Menampilkan detail transaksi saat ini
            System.out.println("Detail Transaksi:");
            System.out.println("  Jumlah tiket dibeli: " + jumlahTiket);
            System.out.printf("  Diskon yang didapat: %.0f%%\n", diskonPersen * 100); // Menampilkan diskon dalam persen
            System.out.printf("  Harga transaksi ini: Rp %,.0f\n", hargaTransaksiSetelahDiskon); // Menampilkan harga setelah diskon
        }

        // Menampilkan rekapitulasi penjualan harian setelah perulangan selesai
        System.out.println("\n--- Rekapitulasi Penjualan Harian ---");
        System.out.println("Total tiket terjual: " + totalTiketTerjual + " tiket");
        System.out.printf("Total harga penjualan: Rp %,.0f\n", totalHargaPenjualan); // Menampilkan total harga penjualan

        input.close(); // Menutup objek Scanner
    }
}