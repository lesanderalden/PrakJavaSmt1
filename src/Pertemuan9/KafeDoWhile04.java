// P = 4
// hargaKopi = 10000 + (4%5) x 1000 = 10000 + 4000 = 14000
// hargaTeh =  5000 + (4%4) x 1000 = 5000 + 0 = 5000
// hargaRoti = 15000 + (4%6) x 1000 = 15000 + 4000 = 19000

package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 14000, hargaTeh = 5000, hargaRoti = 19000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = alden.nextLine();
            
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = alden.nextInt();
            System.out.print("Jumlah teh: ");
            teh = alden.nextInt();
            System.out.print("Jumlah roti: ");
            roti = alden.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp"+totalHarga);
            alden.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
        alden.close();
    }
}
