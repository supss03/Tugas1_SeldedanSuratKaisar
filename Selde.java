package Tugas1;

import java.util.Scanner;

public class Selde {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2;

        bil1 = input.nextInt();
        bil2 = bil1;

        hasil(bil1, bil2);
    }

    public static int selde(int bil1, int jumlah) {
        while (bil1 > 0) {
            int mod = bil1 % 10;
            jumlah = jumlah * 10 + mod;
            bil1 = bil1 / 10;
        }

        return jumlah;
    }

    public static void hasil(int bil1, int bil2) {
        if (bil2 == selde(bil1, 0)) {
            System.out.println(bil2 + " adalah selde.");
        }
        else {
            System.out.println(bil2 + " bukan selde.");
        }
    }
}