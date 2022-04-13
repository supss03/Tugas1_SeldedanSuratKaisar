package Tugas1;

import java.util.Scanner;

public class SuratKaisar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata;
        int geser;

        kata = input.nextLine();
        geser = input.nextInt();

        hasilGeser(kata, geser);
    }

    public static void geserChar(int ubah, int tetap) {
        if (ubah >= 91 && ubah <= 96) {
            int hasil = ubah - 90 + 64;
            String tampil = Character.toString(hasil);
            System.out.print(tampil);
        }
        else if (ubah >= 123) {
            int hasil = ubah - 122 + 96;
            String tampil = Character.toString(hasil);
            System.out.print(tampil);
        }
        else if (tetap == 32) {
            String tampil = Character.toString(tetap);
            System.out.print(tampil);
        }
        else {
            String tampil = Character.toString(ubah);
            System.out.print(tampil);
        }
    }

    public static void hasilGeser(String kata, int geser) {
        for (int i = 0; i <= kata.length() - 1; i++) {
            int ubah = kata.charAt(i) + geser;
            int tetap = kata.charAt(i);

            geserChar(ubah, tetap);
        }

    }

}
