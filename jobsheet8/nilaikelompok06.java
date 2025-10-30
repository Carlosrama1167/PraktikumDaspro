package jobsheet8;

import java.util.Scanner;

public class nilaikelompok06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  nilai;
        float totalnilai, ratanilai;
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
            System.out.print("kelompok " + i);
            System.out.println(": nilai rata-rata = " + ratanilai);
            i++;
        }
    }
}
