package jobsheet11;

public class tugas1 {
    public double hitungvolumekubus(double sisi){
        return sisi * sisi * sisi;
    }
    public double hitungluarpermukaankubus(double sisi){
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        tugas1 kubus = new tugas1();
        double sisi = 5.0;

        double volume = kubus.hitungvolumekubus(sisi);
        double luasPermukaan = kubus.hitungluarpermukaankubus(sisi);

        System.out.println("Sisi Kubus: " + sisi);
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
