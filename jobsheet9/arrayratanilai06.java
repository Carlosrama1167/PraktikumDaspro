package jobsheet9;

import java.util.Scanner;

public class arrayratanilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahmhs = input.nextInt();

        int [] nilaimhs = new int [jumlahmhs] ;
        double totallulus = 0;
        double totaltdklulus=0;
        double total = 0;
        double rata; 
        int lulus = 0;
        int tidaklulus =0;

        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("Masukkan nilai mahsiswa ke-" + (i+1) + " : ");
            nilaimhs [i] = input.nextInt();

            if (nilaimhs [i] >= 70){
                totallulus += nilaimhs [i];
                lulus++;
            } else {
                totaltdklulus += nilaimhs [i];
                tidaklulus++;
            }
        }
        for (int i = 0; i < nilaimhs.length; i++) {
            total += nilaimhs [i];
        }
        double mhslulus = 0;
        double mhstidaklulus = 0;
        if (lulus > 0){
            mhslulus = totallulus / lulus;
        } 
        if (tidaklulus > 0){
            mhstidaklulus = totaltdklulus / tidaklulus;
        }
        
        rata = total / nilaimhs.length;
        System.out.println("rata-rata nilai lulus = " + mhslulus);
        System.out.println("rata-rata nilai tidak lulus = " + mhstidaklulus);
        System.out.println("rata rata nilai = " + rata);
    }
}
