package jobsheet8;

import java.util.Scanner;

public class nilaikelompok06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  nilai;
        float totalnilai;
        float ratanilai;

        int keltertinggi = 0;
        float ratatertinggi = 0;

        int i = 1;
        while (i <= 6){
            System.out.println("kelompok " + i);

            totalnilai = 0;
            for (int j = 1; j<=5; j++){
                System.out.print(" Nilai dari kelompok Penilai " + j + ": ");
                nilai = input.nextInt();
                totalnilai += nilai;
            }
            ratanilai = totalnilai / 5;
            if (ratanilai > ratatertinggi){
                ratatertinggi = ratanilai;
                keltertinggi = i;
            }
            System.out.print("kelompok " + i);
            System.out.println(": nilai rata-rata = " + ratanilai);
            i++;
        }
        System.out.println("Hasil Kelompok tertinggi");
        System.out.println("kelompok tertinggi " + keltertinggi );
        System.out.println("Nilai rata-rata kelompok : " + ratatertinggi);
    }
}
