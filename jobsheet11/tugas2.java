
package jobsheet11;

import java.util.Scanner;

public class tugas2 { // Nama class diubah menjadi Tugas2 sesuai permintaan

    
    public void isianArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        int N = arr.length;
        System.out.println("\n--- Mengisi Nilai Mahasiswa ---");
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    public void tampilArray(int[] arr) {
        System.out.println("\n--- Daftar Nilai Mahasiswa ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    public double hitTot(int[] arr) {
        double total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilaiMahasiswa = new int[N];
   
        tugas2 program = new tugas2();

        program.isianArray(nilaiMahasiswa);

        program.tampilArray(nilaiMahasiswa);

        double totalNilai = program.hitTot(nilaiMahasiswa);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total Nilai Keseluruhan Mahasiswa: " + totalNilai);
     
        if (N > 0) {
            double rataRata = totalNilai / N;
            System.out.println("Rata-rata Nilai Kelas: " + rataRata);
        } else {
             System.out.println("Tidak ada mahasiswa yang diinput.");
        }
        
        input.close();
    }
}