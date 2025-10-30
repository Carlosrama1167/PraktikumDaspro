package jobsheet8;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batasN ;
        String nilaitetap = "";
        int jkuadrat = 0;
        
        System.out.print("jumlah n : ");
        batasN = input.nextInt();

        for (int n = 1; n <= batasN; n++){
            int angkaskrng = n * n;
            jkuadrat  += angkaskrng;

            if (n == 1){
                nilaitetap = String.valueOf(angkaskrng);
            }else{
                nilaitetap += " + " + angkaskrng;
            }
            System.out.println("n = " + n + " -> jumlah kuadrat " + nilaitetap + " = " + jkuadrat);
        }
    }
}