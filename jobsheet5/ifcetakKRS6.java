package  jobsheet5;
import java.util.Scanner;

public class ifcetakKRS6{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktlunas = sc.nextBoolean();

        String pesan = (uktlunas) ? "pembayaran UKT terverivikasi" : "ukt belum di bayar, bayar dulu";
        System.out.println("ukt lunas" + uktlunas + "adalah: " + pesan);
    }
}