
import java.util.Scanner;

public class CM06_Rama {

    static int MAX_PENDAFTAR = 100;
    static int JMLH_ATRIBUT = 6;
    static String[][] dataPendaftar = new String[MAX_PENDAFTAR][JMLH_ATRIBUT];

    static int totalPendaftar = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       
        int pilihan;

        do { 
            tampilkanMenu();

            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            pilihan = validasipilihan(pilihan);

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

        input.close();
    }

    public static void tampilkanMenu() {
        System.out.println("=== Sistem Pendaftaran Ujian Skripsi ===");
        System.out.println("1. Tambah Data Pendaftar");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar Berdasarkan Dosen Pembimbing");
        System.out.println("4. Hitung Jumlah Pendaftar Per Gelombang");
        System.out.println("5. Keluar");
    }

    public static int validasipilihan(int pilihan) {
        while (pilihan < 1 || pilihan > 5) {
            System.out.print("Pilihan tidak valid. Silakan pilih antara 1 sampai 5: ");
            pilihan = input.nextInt();
        }
        return pilihan;
    }

    public static void tambahDataPendaftar() {
        if (totalPendaftar >= MAX_PENDAFTAR) {
            System.out.println("Maaf, kapasitas pendaftar sudah penuh.");
            return;
        }

        System.out.print("Nama Mahasiswa: ");
        dataPendaftar[totalPendaftar][0] = input.next();
        System.out.print("NIM: ");
        dataPendaftar[totalPendaftar][1] = input.next();
        System.out.print("Judul Skripsi: ");
        dataPendaftar[totalPendaftar][2] = input.next();
        System.out.print("Dosen Pembimbing: ");
        dataPendaftar[totalPendaftar][3] = input.next();

        int gelombang = 0;
        System.out.print("Gelombang (1, 2, atau 3): ");
        while (true) {
            if (input.hasNextInt()) {
                gelombang = input.nextInt();
                if (gelombang >= 1 && gelombang <= 3) {
                    dataPendaftar[totalPendaftar][4] = String.valueOf(gelombang);
                    break;
                } else {
                    System.out.println("Input Gelombang tidak valid.");
                    System.out.print("Gelombang (1, 2, atau 3): ");
                }
            } else {                                                            
                System.out.print("Input harus berupa angka (1, 2, atau 3): ");
                input.next(); 
            }
        }
        input.nextLine();
        
        int logBimbingan = 0;
        System.out.print("Total Log Bimbingan (Minimal 8): ");
        while (true) {
            if (input.hasNextInt()) {
                logBimbingan = input.nextInt();
                if (logBimbingan >= 8) {
                    dataPendaftar[totalPendaftar][5] = String.valueOf(logBimbingan);
                    break;
                } else {
                    System.out.println("Total log harus minimal 8.");
                    System.out.print("Total Log Bimbingan (Minimal 8): ");
                }
            } else {                                                            
                System.out.print("Total Log Bimbingan (Minimal 8):  ");
                input.next(); 
            }
        }
        input.nextLine();

        totalPendaftar++;
        System.out.println("Pendaftar berhasil disimpan. Total Pendaftar Saat Ini : " + totalPendaftar);
    }

    public static void cariPendaftarBerdasarkanDosen() {
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.print("Masukkan nama dosen pembimbing yang dicari: ");
        String namaDosen = input.next();

        System.out.println("--- Hasil Pencarian Pendaftar untuk Dosen: " + namaDosen + " ---");
        boolean ditemukan = false;

        for (int i = 0; i < totalPendaftar; i++) {
            if (dataPendaftar[i][3].equalsIgnoreCase(namaDosen)) {
                ditemukan = true;
                System.out.println( 
                                  "Nama: " + dataPendaftar[i][0] + ", " +
                                  "NIM: " + dataPendaftar[i][1] + ", " +
                                  "Judul Skripsi: " + dataPendaftar[i][2] + ", " +
                                  "Gelombang: " + dataPendaftar[i][4] + ", " +
                                  "Log Bimbingan: " + dataPendaftar[i][5]);
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada pendaftar yang ditemukan untuk dosen tersebut.");
        }
    }

    public static void tampilkanSemuaPendaftar() {
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("--- Daftar Pendaftar Ujian Skripsi ---");
        System.out.println( "No" + "\tNama" + "\tNIM" + "\tJudul Skripsi" + "\t\tDosen Pembimbing" + "\tGelombang" + "\tLog");
                         
        System.out.println("--------------------------------------------------------------------------------------------------");

        for (int i = 0; i < totalPendaftar; i++) {
            String judulPendek = dataPendaftar[i][2];
            if (judulPendek.length() > 15) {
                judulPendek = judulPendek.substring(0, 12) + "..."; // Batasi panjang judul
            }
            System.out.println( 
                              i + 1 + ".\t" +
                              dataPendaftar[i][0] + "\t" +      // Nama
                              dataPendaftar[i][1] + "\t" +      // NIM
                              judulPendek         + "\t\t" +    // Judul Skripsi
                              dataPendaftar[i][3] + "\t\t\t" +  // Dosen Pembimbing
                              dataPendaftar[i][4] + "\t\t" +    // Gelombang
                              dataPendaftar[i][5]);             // Log Bimbingan
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
    }

    public static void hitungJumlahPendaftarPerGelombang() {
        if (totalPendaftar == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        int[] jumlahPerGelombang = new int[4]; 

        for (int i = 0; i < totalPendaftar; i++) {
            int gelombang = Integer.parseInt(dataPendaftar[i][4]);
            if (gelombang >= 1 && gelombang <= 3) {
                jumlahPerGelombang[gelombang]++;
            }
        }
        System.out.println("--- Hitungan Pendaftar per Gelombang ---");
        System.out.println("Gelombang 1: " + jumlahPerGelombang[1]);
        System.out.println("Gelombang 2: " + jumlahPerGelombang[2]);
        System.out.println("Gelombang 3: " + jumlahPerGelombang[3]);
        System.out.println("Total pendaftar: " + totalPendaftar);
    }
}
