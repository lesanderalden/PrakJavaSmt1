// P = 4
// Jumlah Mahasiswa = 8 + (4%5) = 8 + 4 = 12
// Batas Kelulusan pada pertanyaan no 4 = 55 + (4%11) = 55 + 4 = 59

package Pertemuan9;

import java.util.Scanner;

public class SiakadFor04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = alden.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
        alden.close();
    }
}
