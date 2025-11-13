package jobsheet10;

import java.util.Arrays;

public class numbers06 {
    public static void main(String[] args) {
        int [] [] mynumbers = new int [3] [];
        mynumbers[0] = new int [5];
        mynumbers[1] = new int [3];
        mynumbers[2] = new int [1];

        for (int i = 0; i < mynumbers.length; i++) {
            System.out.println(Arrays.toString(mynumbers[i]));
        }
        System.out.println("==============================");
        for (int i = 0; i < mynumbers.length; i++) {
            System.out.println("Panjang Baris ke-" + (i+1) + " : " + mynumbers[i].length);
        }
    }
}
