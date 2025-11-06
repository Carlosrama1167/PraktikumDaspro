package jobsheet9;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        double total = 0;
        double rata ;
        double tertinggi = 0;
        double terendah = 0;
        double tinggi = 0;
        double rendah = 0;

        for (int i = 1; i <= nilai.length; i++) {
           System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai [i] = input.nextInt(); 

             if (nilai [i] >= 70){
                tertinggi += nilai [i];
                tinggi++;
            } else {
                terendah += nilai [i];
                rendah++;
            }
        }
        for (int i = 1; i <= nilai.length; i++) {
           total += nilai [i]; 
        }
        double mhstertinggi = 0;
        double mhsterrendah = 0;
        if (tinggi > 0){
            mhstertinggi = tertinggi / tinggi;
        }
        if (rendah > 0){
            mhsterrendah = terendah / rendah;
        }
        rata = total / nilai.length;
        System.out.println("rata rata nilai = " + rata);
        System.out.println("Mahasiswa nilai tertinggi = " + mhstertinggi);
        System.out.println("Mahasiswa nilai terrendah = " + mhsterrendah);
        input.close();
    }
}
