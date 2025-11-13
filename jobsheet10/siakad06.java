package jobsheet10;

import java.util.Scanner;

public class siakad06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] nilai = new int[4][3];

        System.out.println("==============================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1));
            double totalpersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j+1) + " : " );
                nilai[i][j] = input.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println("Rata-rata nilai mahasiswa: " + (totalpersiswa / 3));
        }
        System.out.println("==============================");
        System.out.println("Rata-rata nilai setiap mata kuliah");

        for (int j = 0; j < 3; j++) {
            double totalpermatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalpermatkul += nilai[i][j];
            }
            System.out.println("mata kuliah ke-" + (j+1) + " : " + (totalpermatkul / 4));
        }
    }
}
