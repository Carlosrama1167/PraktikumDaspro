package jobsheet12;

import java.util.Scanner;

public class percobaan2 {
    static int hitungpangkat(int x, int y){
        if (y == 0){
            return (1);
        } else {
            return (x * hitungpangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bilangan yang dihitung : ");
        int bilangan = input.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = input.nextInt();

        System.out.println("hasil pangkatnya adalah : ");
        System.out.println(hitungpangkat(bilangan, pangkat));
    }
}
