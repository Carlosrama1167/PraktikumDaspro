import java.util.Scanner;

public class ifcetakKRS06{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.println("Apakah UKT sudah lubas? (true/false)");
        boolean uktlunas = sc.nextBoolean();

        if (uktlunas) {
        System.out.println("pembayaran UKT terverivikasi");
        System.out.println("silahkan cetak KRS dan minta tanda tangan DPA");
        }
        
    }
}