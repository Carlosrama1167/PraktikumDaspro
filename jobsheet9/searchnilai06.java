package jobsheet9;

import java.util.Scanner;

public class searchnilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int nilai = input.nextInt();

        int [] arrnilai = new int [nilai];
        int key ;
        int hasil = 0;

        for (int i = 0; i < arrnilai.length; i++) {
            System.out.print("Masukkan nilai mahsiswa ke-" + (i+1) + " : ");
            arrnilai[i]= input.nextInt();
        }
        System.out.print("Masukkan nilai yang di cari: ");
        key = input.nextInt();
        for (int i = 0; i < arrnilai.length; i++) {
           if (key == arrnilai[i]) {
                hasil = i;
                System.out.println("\nnilai "+ key+ " ketemu di indeks ke-" + hasil);
               
           } else {
                hasil = -1;
                System.out.print("\nnilai di cari tidak ditemukan");
                
           }
           break;
        }
        
        System.out.println();
        
    }
}
