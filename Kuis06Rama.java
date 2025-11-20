
public class Kuis06Rama {
    
    public static void main(String[] args) {
        
        int pemasukan06 [][] = {
            {6,9,8},
            {5,7,6},
            {7,8,9},
            {3,6,7},
            {3,5,4}
        };
        String Buku06 [][] = {
            {"fiksi"},
            {"non fiksi"},
            {"pendidikan"},
            {"komik"},
            {"anak-anak"}
        };
        String hari06 [] = {
            "Senin",
            "sabtu",
            "minggu"
        };


        System.out.println("==========================");
        System.out.println("Daftar penjualan dalam Seminggu");
        System.out.println("==========================");
        int totalPemasukan = 0;
        int bukunonfiksi = 0;
        int bukunonfiksi2 = 0;
        int totalPerhari = 0;
        for (int i = 0; i < hari06.length; i++) {
            System.out.println("Hari : " + hari06[i]);
            int totalperhari = 0;
            
            for (int j = 0; j < pemasukan06[i].length; j++) {
                System.out.println("Jenis Buku : " + Buku06[j][0] + " | " + "Pemasukan : " + pemasukan06[i][j] + " buku");
            }
            totalperhari = pemasukan06[i][0] + pemasukan06[i][1] + pemasukan06[i][2];
            bukunonfiksi += pemasukan06[i][1];
            totalPerhari = totalperhari ;
            bukunonfiksi2 = bukunonfiksi ;
            totalPemasukan += totalperhari;
            
        }
        int nonfiksi = bukunonfiksi2 / 3;
        System.out.println("==========================");
        System.out.println("total pemasukan perhari : " + totalPerhari + " buku");
        System.out.println("Total Pemasukan Dalam 3 hari : " + totalPemasukan + " buku");
        System.out.println("Total Buku Non Fiksi Terjual : " + nonfiksi + " buku");
    }
}
