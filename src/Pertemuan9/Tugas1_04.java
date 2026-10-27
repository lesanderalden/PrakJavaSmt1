// P = 4
// Harga tiket = 40000 + (4%6) × 2000 = 48000
// Syarat diskon pertama = lebih dari (3 + (4%3)) tiket = lebih dari 4 + 1 = 5 tiket, dengan diskon (8 + (4%5))% = 8 + 4 = 12%
// Syarat diskon kedua = lebih dari (8 + (4%4)) tiket = lebih dari 8 + 0 = 8 tiket, dengan diskon (15 + (4%4))% = 15 + 0 = 15%

package Pertemuan9;

import java.util.Scanner;

public class Tugas1_04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int tiket, totalTiket=0;
        double hargaTiket = 48000, diskon, hargaTotal, hargaAkhir = 0, total = 0;
        String namaPelanggan, pesan = "";

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'stop' untuk keluar): ");
            namaPelanggan = alden.nextLine();
            if (namaPelanggan.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Masukkan jumlah tiket: ");
            tiket = alden.nextInt();

            if (tiket < 0) {
                continue;
            }

            hargaTotal = hargaTiket * tiket;

            if (tiket > 8) {
                diskon = 0.15 * hargaTotal;
                pesan = "Mendapat diskon 15%";
            } else if (tiket > 5) {
                diskon = 0.12 * hargaTotal;
                pesan = "Mendapat diskon 12%";
            } else {
                diskon = 0;
                pesan = "Tidak mendapat diskon";
            }

            hargaAkhir = hargaTotal - diskon;
            total += hargaAkhir;
            totalTiket += tiket;
            System.out.println("Harga total: Rp"+hargaAkhir);
            System.out.println(pesan);
            alden.nextLine();
        } while (true);
        System.out.println("Total tiket terjual: "+totalTiket);
        System.out.println("Total pendapatan: Rp"+total);
        alden.close();
    }
}
