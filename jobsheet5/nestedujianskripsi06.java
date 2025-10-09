import java.util.Scanner;

public class nestedujianskripsi06{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       String pesan;
       System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak) : ");
        String bebaskompen = sc.nextLine().trim();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbingan1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbingan2 = sc.nextInt();

        if (bebaskompen.equalsIgnoreCase("ya")) {
            if (bimbingan1 >= 8 && bimbingan2 >= 4){
                pesan = "semua syarat terpenuhi. mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbingan1 < 8 && bimbingan2 < 4) {
                pesan = "gagal! log bimbingan P1 kurang dari 8 kali P2 kuramg dari 4 kali";
            } else if (bimbingan1 < 8) {
                pesan = "gagal! log bimbingan p1 belum mencapai 8 kali";
            } else {
                pesan = "gagal! log bimbingan p2 belum mencapai 4 kali";
            }
        }else {
            pesan = "gagal mahasiswa masih memiliki tanggungan koompen";
        }
        System.out.println(pesan);
    }
    
       
}