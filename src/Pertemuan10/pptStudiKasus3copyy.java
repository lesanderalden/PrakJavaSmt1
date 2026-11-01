package Pertemuan10;

import java.util.Scanner;

public class pptStudiKasus3copyy {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int jumlahTerjual, jumlahProduk = 3;
        int totalPerProduk = 0, jumlahHari = 4;
        int totalPenjualan = 0;

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("Produk ke-"+(i+1));
            for (int j = 0; j < jumlahHari; j++) {
                
                System.out.print("H-"+(j+1)+": ");
                jumlahTerjual = alden.nextInt();

                totalPerProduk += jumlahTerjual;
            }
            System.out.println("Total penjualan produk "+(i+1)+" adalah "+totalPerProduk);

            totalPenjualan += totalPerProduk;
            totalPerProduk = 0;
        }
        System.out.println("Total Seluruh Produk yang terjual: "+totalPenjualan);
        alden.close();
    }
}
