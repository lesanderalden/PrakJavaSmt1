// P = 4
// Tarif parkir mobil = 2500 + (4%6) × 250 per jam = 2500 + 1000 = 3500
// Tarif parkir motor = 1500 + (4%6) × 250 per jam = 1500 + 1000 = 2500

package Pertemuan9;

import java.util.Scanner;

public class Tugas2_04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int jenis = 0, durasi, total = 0;

        do {
            // System.out.println("1. Mobil \n2. Motor \n0. Keluar");
            System.out.print("Masukkan jenis kendaraan(1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = alden.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = alden.nextInt();
                if (jenis == 1) {
                    total += durasi * 3500;
                } else {
                    total += durasi * 2500;
                }
            }
        } while (jenis != 0);
        System.out.println("Total yang harus dibayar: Rp"+total);
        alden.close();
    }
}
