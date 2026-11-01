package Pertemuan10;

import java.util.Scanner;

public class Star04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = alden.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        alden.close();
    }
}
