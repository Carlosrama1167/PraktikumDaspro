package jobsheet8;

import java.util.Scanner;

public class star06 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai n = ");
    int n = input.nextInt();

    for (int i=1; i<=n; i+=2){
        System.out.print("*");
    }
    }
}
