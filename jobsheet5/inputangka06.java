import java.util.Scanner;

public class inputangka06{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int angka;
        System.out.println("Masukkan sebuah angka: ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
        

    }
}