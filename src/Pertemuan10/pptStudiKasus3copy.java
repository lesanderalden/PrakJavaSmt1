package Pertemuan10;

import java.util.Scanner;

public class pptStudiKasus3copy {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        int jumlahTerjual, jumlahProduk = 3;
        int totalPerProduk = 0, jumlahHari = 4;
        int totalPenjualan = 0, totalHari1=0, totalHari2=0, totalHari3=0, totalHari4=0;

        for (int i = 0; i < jumlahProduk; i++) {
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Masukkan jumlah terjual produk "+(i+1)+" pada H-"+(j+1)+": ");
                jumlahTerjual = alden.nextInt();

                totalPerProduk += jumlahTerjual;
                if (j == 0) {
                    totalHari1 += jumlahTerjual;
                } else if (j == 1) {
                    totalHari2 += jumlahTerjual;
                } else if (j == 2) {
                    totalHari3 += jumlahTerjual;
                } else if (j == 3) {
                    totalHari4 += jumlahTerjual;
                }
            }
            System.out.println("Total penjualan produk "+(i+1)+" adalah "+totalPerProduk);

            totalPenjualan += totalPerProduk;
            totalPerProduk = 0;
        }
        System.out.println("Total Seluruh Produk yang terjual: "+totalPenjualan);
        System.out.println("Total Hari ke 1: "+totalHari1);
        System.out.println("Total Hari ke 2: "+totalHari2);
        System.out.println("Total Hari ke 3: "+totalHari3);
        System.out.println("Total Hari ke 4: "+totalHari4);
        alden.close();
    }
}
