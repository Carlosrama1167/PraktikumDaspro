import java.util.Scanner;

public class SistemSkripsiTanpaTryCatch {

    // Konstanta untuk ukuran array
    static int MAX_PENDAFTAR = 100;
    static int JMLH_ATRIBUT = 6;

    // Global Array 2D (String) untuk menyimpan data pendaftar
    // Kolom: 0: Nama, 1: NIM, 2: Judul Skripsi, 3: Dosen Pembimbing,
    // 4: Gelombang, 5: Total Log Bimbingan
    static String[][] dataPendaftar = new String[MAX_PENDAFTAR][JMLH_ATRIBUT];

    // Variabel untuk melacak jumlah pendaftar saat ini
    static int totalPendaftar = 0;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        // Program berjalan secara dinamis (interaktif)
        do {
            tampilkanMenu();

            System.out.print("Pilih menu (1-5): ");
            pilihan = validasiInputMenu();

            System.out.println("-------------------------------------------");

            switch (pilihan) {
                case 1:
                    tambahDataPendaftar();
                    break;
                case 2:
                    tampilkanSemuaPendaftar();
                    break;
                case 3:
                    cariPendaftarBerdasarkanDosen();
                    break;
                case 4:
                    hitungJumlahPendaftarPerGelombang();
                    break;
                case 5:
                    System.out.println("Keluar dari sistem. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println("\n===========================================");

        } while (pilihan != 5);
        
        scanner.close();
    }

    /**
     * Fungsi untuk menampilkan menu utama.
     */
    public static void tampilkanMenu() {
        System.out.println("\n=== Sistem Pendaftaran Ujian Skripsi ===");
        System.out.println("1. Tambah Data Pendaftar");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Dosen Pembimbing");
        System.out.println("4. Hitung Jumlah Pendaftar per Gelombang");
        System.out.println("5. Keluar");
    }

    /**
     * Fungsi untuk validasi input pilihan menu (1-5) TANPA try-catch.
     */
    public static int validasiInputMenu() {
        int pilihan = -1;
        
        while (true) {
            // 1. Validasi Tipe Data (Harus Integer)
            if (scanner.hasNextInt()) { 
                System.out.print("Input harus berupa angka. Pilih antara 1 sampai 5: ");
                scanner.next(); // Buang input non-integer
                continue; // Lanjut ke iterasi berikutnya
            }
            
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer setelah nextInt()
            
            // 2. Validasi Rentang (Harus 1-5)
            if (pilihan >= 1 && pilihan <= 5) {
                return pilihan; // Input valid, keluar dari loop
            } else {
                System.out.print("Input tidak valid. Pilih antara 1 sampai 5: ");
            }
        }
    }

    /**
     * Fungsi untuk menambahkan data pendaftar baru.
     */
    public static void tambahDataPendaftar() {
        if (totalPendaftar >= MAX_PENDAFTAR) {
            System.out.println("Kuota pendaftar penuh!");
            return;
        }

        System.out.print("Nama Mahasiswa: ");
        dataPendaftar[totalPendaftar][0] = scanner.nextLine();

        System.out.print("NIM: ");
        dataPendaftar[totalPendaftar][1] = scanner.nextLine();

        System.out.print("Judul Skripsi: ");
        dataPendaftar[totalPendaftar][2] = scanner.nextLine();

        System.out.print("Dosen Pembimbing: ");
        dataPendaftar[totalPendaftar][3] = scanner.nextLine();

        // Validasi input Gelombang (1, 2, atau 3)
        int gelombang = 0;
        System.out.print("Gelombang pendaftaran (1, 2, atau 3): ");
        while (true) {
            if (scanner.hasNextInt()) {
                gelombang = scanner.nextInt();
                if (gelombang >= 1 && gelombang <= 3) {
                    dataPendaftar[totalPendaftar][4] = String.valueOf(gelombang);
                    break;
                } else {
                    System.out.print("Input Gelombang tidak valid. Masukkan 1, 2, atau 3: ");
                }
            } else {
                System.out.print("Input harus berupa angka (1, 2, atau 3): ");
                scanner.next(); // Buang token non-integer
            }
        }
        scanner.nextLine(); // Membersihkan buffer

        // START: Perubahan Validasi input Total Log Bimbingan (minimal 8)
        int logBimbingan = 0;
        
        // Loop ini akan terus berjalan sampai input memenuhi kriteria (angka dan >= 8)
        while (true) {
            System.out.print("Total log bimbingan (minimal 8): ");
            
            if (scanner.hasNextInt()) {
                logBimbingan = scanner.nextInt();
                
                if (logBimbingan >= 8) {
                    // Input valid: simpan dan keluar dari loop
                    dataPendaftar[totalPendaftar][5] = String.valueOf(logBimbingan);
                    break;
                } else {
                    // Input angka, tapi kurang dari 8
                    System.out.println("!!! TOTAL LOG HARUS MINIMAL 8 !!!"); // Pemberitahuan
                    // Loop akan berlanjut, meminta input ulang
                }
            } else {
                // Input bukan angka
                System.out.println("!!! TOTAL LOG HARUS BERUPA ANGKA !!!"); // Pemberitahuan
                scanner.next(); // Buang token non-integer
                // Loop akan berlanjut, meminta input ulang
            }
        }
        scanner.nextLine(); // Membersihkan buffer
        // END: Perubahan Validasi

        totalPendaftar++;
        System.out.println("Pendaftar berhasil disimpan. Total pendaftar saat ini: " + totalPendaftar);
    }

    /**
     * Fungsi untuk menampilkan semua data pendaftar menggunakan nested loop.
     */
    public static void tampilkanSemuaPendaftar() {
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("--- Daftar Semua Pendaftar ---");
        
        // Header Tabel
        System.out.printf("%-3s | %-15s | %-10s | %-35s | %-12s | %-5s | %-3s%n", 
                          "No", "Nama", "NIM", "Judul Skripsi", "Dosen Pmbg", "Gel", "Log");
        System.out.println("--------------------------------------------------------------------------------------------------");

        // Loop luar: Iterasi melalui setiap pendaftar (Baris)
        for (int i = 0; i < totalPendaftar; ++i) {
            String judulPendek = dataPendaftar[i][2];
            if (judulPendek.length() > 30) {
                judulPendek = judulPendek.substring(0, 27) + "..."; // Batasi panjang judul
            }

            // Akses Kolom
            System.out.printf("%-3d | %-15s | %-10s | %-35s | %-12s | %-5s | %-3s%n", 
                              i + 1,
                              dataPendaftar[i][0],  // Nama
                              dataPendaftar[i][1],  // NIM
                              judulPendek,          // Judul Skripsi
                              dataPendaftar[i][3],  // Dosen Pembimbing
                              dataPendaftar[i][4],  // Gelombang
                              dataPendaftar[i][5]); // Log Bimbingan
        }
    }

    /**
     * Fungsi untuk mencari pendaftar berdasarkan nama dosen pembimbing.
     */
    public static void cariPendaftarBerdasarkanDosen() {
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.print("Masukkan Nama Dosen Pembimbing yang dicari: ");
        String dosenTarget = scanner.nextLine().trim();

        boolean ditemukan = false;
        System.out.println("\n--- Hasil Pencarian Pendaftar oleh Dosen " + dosenTarget + " ---");

        // Loop untuk mencari pendaftar
        for (int i = 0; i < totalPendaftar; ++i) {
            if (dataPendaftar[i][3].equalsIgnoreCase(dosenTarget)) {
                System.out.println("No: " + (i + 1) + 
                                   ", Nama: " + dataPendaftar[i][0] +
                                   ", NIM: " + dataPendaftar[i][1] + 
                                   ", Judul: " + dataPendaftar[i][2] + 
                                   ", Gelombang: " + dataPendaftar[i][4] + 
                                   ", Log: " + dataPendaftar[i][5]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ditemukan pendaftar dengan Dosen Pembimbing " + dosenTarget + ".");
        }
    }

    /**
     * Fungsi untuk menghitung total pendaftar per gelombang.
     */
    public static void hitungJumlahPendaftarPerGelombang() {
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        int[] hitungan = new int[4]; 

        // Loop untuk menghitung
        for (int i = 0; i < totalPendaftar; ++i) {
            int gelombang = Integer.parseInt(dataPendaftar[i][4]);
            
            if (gelombang >= 1 && gelombang <= 3) {
                hitungan[gelombang]++;
            }
        }

        System.out.println("--- Hitungan Pendaftar per Gelombang ---");
        System.out.println("Gelombang 1: " + hitungan[1]);
        System.out.println("Gelombang 2: " + hitungan[2]);
        System.out.println("Gelombang 3: " + hitungan[3]);
        System.out.println("Total pendaftar: " + totalPendaftar);
    }
}