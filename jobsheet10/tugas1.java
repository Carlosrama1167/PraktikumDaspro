package jobsheet10;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] survey = new int [10][6];
        double totalsemua = 0;
        System.out.println("==============================");
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Pelanggan ke-" + (i+1));
            double totalsurvey = 0;

            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("berikan nilai survey 1-5 ke-" + (j+1) + " : " );
                survey[i][j] = input.nextInt();
                if (survey [i][j] >= 1 && survey[i][j] <= 5) {
                    System.out.println("nilai valid");
                } else {
                    System.out.println("nilai tidak valid, masukkan nilai antara 1-5");
                    j--;
                    continue;
                }
                totalsurvey += survey[i][j];
                totalsemua += survey[i][j];
            }
            System.out.println("Rata-rata setiap pertanyaan: " + (totalsurvey / 6));
        }
        System.out.println("==============================");
        System.out.println("Rata-rata setiap responden");

        for (int j = 0; j < survey.length; j++) {
            double totalpersurvey = 0;

            for (int i = 0; i < survey.length; i++) {
                totalpersurvey += survey[i][j];
            }
            System.out.println("survey pelanggan ke-" + (j+1) + " : " + (totalpersurvey / 10));
        }
        System.out.println("=========================");
        double total = totalsemua / 60;
        System.out.println("Rata-rata keseluruhan survey : " + total );
        
        input.close();
    }
}
