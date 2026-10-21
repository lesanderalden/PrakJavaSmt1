//B = 3 + (4 % 3) = 3 + 1 = 4
//S = 6 + (4 % 3) = 6 + 1 = 7
//Sepeda biasa = 5000 + (4%4) * 1000 = 5000
//Sepeda Listrik = 12000 + (4%4) * 1000 = 12000
//Sepeda Tandem = 8000 + (4%4) * 1000 = 8000 

package Pertemuan8;
import java.util.Scanner;

public class SepedaKampus_04 {
    public static void main(String[] args) {
        Scanner alden = new Scanner(System.in);
        String layanan="";
        int kodeLayanan, tarif=0, lamaSewa;
        double diskon, totalBayar, diskonRp;
        boolean isMahasiswa;

        System.out.print("Apakah anda mahasiswa?(true/false): ");
        isMahasiswa = alden.nextBoolean();
        System.out.print("Masukkan kode layanan: ");
        kodeLayanan = alden.nextInt();
        System.out.print("Masukkan lama sewa: ");
        lamaSewa = alden.nextInt();
        switch (kodeLayanan) {
            case 1:
                layanan = "Sepeda Biasa";
                if (lamaSewa >=1 && lamaSewa <=12) {
                    if (lamaSewa <= 4) {
                        tarif = 5000 * lamaSewa;
                    } else {
                        tarif = 20000 + (1/2 * 5000 * lamaSewa);
                    }
                } else {
                    System.out.println("Input tidak valid");
                }
                break;
            case 2:
                layanan = "Sepeda Listrik";
                if (lamaSewa >=1 && lamaSewa <=12) {
                    if (lamaSewa <= 4) {
                        tarif = 12000 * lamaSewa;
                    } else {
                        tarif = 48000 + (1/2 * 5000 * lamaSewa);
                    }
                } else {
                    System.out.println("Input tidak valid");
                }
                break;
            case 3: 
                layanan = "Sepeda Tandem";
                if (lamaSewa >=1 && lamaSewa <=12) {
                    if (lamaSewa <= 4) {
                        tarif = 8000 * lamaSewa;
                    } else {
                        tarif = 32000 + (1/2 * 5000 * lamaSewa);
                    }
                } else {
                    System.out.println("Input tidak valid");
                }
                break;
            default:
                System.out.println("Kode tidak dikenal");
                break;  
        }

        if (isMahasiswa) {
            if (lamaSewa >= 7) {
                diskon = 0.1;
            } else
                diskon = 0;
        } else
            diskon = 0;

        totalBayar = tarif - diskon;
        diskonRp = diskon * 100;

        System.out.println("Layanan : "+layanan);
        System.out.println("Biaya Dasar : "+tarif);
        System.out.println("Diskon : "+diskonRp+"%");
        System.out.println("Total Bayar : "+totalBayar);
        
    alden.close();
    }
}
