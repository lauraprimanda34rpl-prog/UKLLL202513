/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno6;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class UKLNO6 {
    public static void main(String[] args) {
       
     Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama peminjam: ");
        String nama = input.nextLine();

        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();

        System.out.print("Masukkan kategori buku (A/B/C): ");
        char kategori = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan lama peminjaman (hari): ");
        int lama = input.nextInt();

        int tarif = 0;

        // Tentukan tarif berdasarkan kategori
        switch (kategori) {
            case 'A':
                tarif = 2000;
                break;
            case 'B':
                tarif = 1500;
                break;
            case 'C':
                tarif = 1000;
                break;
            default:
                System.out.println("Kategori tidak valid!");
                return;
        }

        // Hitung biaya awal
        int biayaAwal = tarif * lama;

        // Hitung denda jika lebih dari 7 hari
        int denda = 0;
        if (lama > 7) {
            int hariTerlambat = lama - 7;
            denda = hariTerlambat * 500;
        }

        // Total biaya
        int total = biayaAwal + denda;

        // Output hasil
        System.out.println("\n=== Rincian Peminjaman Buku ===");
        System.out.println("Nama Peminjam       : " + nama);
        System.out.println("Judul Buku          : " + judul);
        System.out.println("Kategori Buku       : " + kategori);
        System.out.println("Lama Peminjaman     : " + lama + " hari");
        System.out.println("Biaya Peminjaman    : Rp " + biayaAwal);
        System.out.println("Denda Keterlambatan : Rp " + denda);
        System.out.println("Total Biaya Akhir   : Rp " + total);
   
        
    }
}
