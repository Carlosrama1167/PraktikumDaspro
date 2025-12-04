package jobsheet12;

public class percobaan1 {
    static int faktorialrekursif(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialrekursif(n - 1));
        }
    }

    static int faktorialliteratif (int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--){
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialrekursif(5));
        System.out.println(faktorialliteratif(5));
    }
}
