package jobsheet9;

import java.util.Scanner;

public class arraynilai06 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int [] nilaiakhir = new int [10];

        for (int i = 0; i < nilaiakhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiakhir [i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++){
            if (nilaiakhir [i] > 70){
                System.out.println("Mahsiswa ke-" + i + " lulus! " );
            } else if (nilaiakhir [i] < 70){
                System.out.println("Mahsiswa ke-" + i + " Tidak lulus! " );
            }
        }
    }
}
