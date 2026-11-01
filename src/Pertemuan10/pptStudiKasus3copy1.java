package Pertemuan10;

import java.util.Scanner;

public class pptStudiKasus3copy1 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int jumlahTerjual, jumlahProduk = 3;
        int totalPerProduk = 0, jumlahHari = 4;
        int totalPenjualan = 0;

        for (int j = 0; j < jumlahHari; j++) {
            for (int i = 0; i < jumlahProduk; i++) {
                
                System.out.print("Masukkan jumlah terjual produk "+(i+1)+" pada H-"+(j+1)+": ");
                jumlahTerjual = alden.nextInt();

                totalPerProduk += jumlahTerjual;
            }
            System.out.println("Total penjualan pada hari ke-"+(j+1)+" adalah "+totalPerProduk);

            totalPenjualan += totalPerProduk;
            totalPerProduk = 0;
        }
        System.out.println("Total Seluruh Produk yang terjual: "+totalPenjualan);
        alden.close();
    }
}
