package jobsheet8;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 5;
        for (int i = 1; i <= n; i++){
            if ( i == 1 ||  i == 2){
                System.out.print("      ");
            } else if (i == 3 || i == 5){
                System.out.print("3 3 3 ");
            } else if (i == 4){
                System.out.print("3   3 ");
            }
            for (int j = 1; j <= 5; j++){
                if (i == 1 || i == n || j == 1 || j ==5){
                    System.out.print("5 ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
