package jobsheet11;

public class pengunjungcafe06 {
    static void daftarpengunjung(String...namapengunjung){
        System.out.println("Daftar Pengunjung Kafe:");
        for(int i = 0; i < namapengunjung.length; i++){
            System.out.println("- " + namapengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarpengunjung("ali", "Budi", "Citra");
        daftarpengunjung("Andi");
        daftarpengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
