package jobsheet7;

import java.util.Scanner;

public class siakadfor06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilai; 
        double tertinggi = 60;
        double terendah = 60;
        int lulus = 0;
        int tidaklulus = 0;


        for (int i = 0; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai > 60){
                lulus++;
            } else {
                tidaklulus++;
            }
        }
        System.out.println("nilai tertinggi: " + tertinggi);
        System.out.println("nilai terendah: " + terendah);
        System.out.println("Mahasiswa lulus: " + lulus);
        System.out.println("Mahasiswa lulus: " + tidaklulus);
    }
}
