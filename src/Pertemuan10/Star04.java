package Pertemuan10;

import java.util.Scanner;

public class Star04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = alden.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        alden.close();
    }
}
