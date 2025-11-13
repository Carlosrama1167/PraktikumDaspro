package jobsheet10;

import java.util.Scanner;

public class siakad06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("input nilai mahasiswa");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int mhs = input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int matkul = input.nextInt();

        int [][] nilai = new int[mhs][matkul];

        System.out.println("==============================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1));
            double totalpersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j+1) + " : " );
                nilai[i][j] = input.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println("Rata-rata nilai mahasiswa: " + (totalpersiswa / matkul));
        }
        System.out.println("==============================");
        System.out.println("Rata-rata nilai setiap mata kuliah");

        for (int j = 0; j < nilai.length; j++) {
            double totalpermatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalpermatkul += nilai[i][j];
            }
            System.out.println("mata kuliah ke-" + (j+1) + " : " + (totalpermatkul / mhs));
        }
    }
}
