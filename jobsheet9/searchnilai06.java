package jobsheet9;

public class searchnilai06 {
    public static void main(String[] args) {
        int [] arrnilai = {80, 85, 78, 96,  90, 82, 86};
        int key = 90;
        int hasil = 0;

        for (int i = 0; i < arrnilai.length; i++) {
           if (key == arrnilai[i]) {
                hasil = i;
                break;
           }
        }
        System.out.println();
        System.out.println("nilai " + key + " ketemu di indeks ke-" + hasil);
        System.out.println();
    }
}
