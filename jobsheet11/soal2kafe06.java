package jobsheet11;

public class soal2kafe06 {
    public static void main(String[] args) {
      menu("Rama", true , "DISKON50");  
        
      System.out.println("------------------------------");
      menu("Budi", false , "DISKON30");

      System.out.println("------------------------------");
        menu("Andi", false , "");
    }
    public static void menu(String namapelanggan, boolean ismember, String kodepromo) {
        System.out.println("Selama datang, " + namapelanggan + "!");

        if (ismember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        } 
        
        if (kodepromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Dapatkan diskon tambahan 50%.");
        } else if (kodepromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Dapatkan diskon tambahan 30%.");
        }else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("====== Menu Resto Kafe ======");
        System.out.println("1. Kopi Hitama - Rp 15.000");
        System.out.println("2. Capuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }
}
