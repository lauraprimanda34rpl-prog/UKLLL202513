/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno5;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKLNO5 {
    public static void main(String[] args) {
        
    
Scanner input = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int menangKomputer = 0;
        int menangPemain = 0;

        System.out.println("=== PERMAINAN LEMPAR DADU ===");
        System.out.println("Pemenang adalah yang pertama mencapai 5 kemenangan!");
        System.out.println();

        while (menangKomputer < 5 && menangPemain < 5) {
            System.out.print("Tekan tombol apa saja untuk melempar dadu...");
            input.next();  // pemain menekan sesuatu untuk melempar

            int daduKomputer = rand.nextInt(6) + 1;
            int daduPemain = rand.nextInt(6) + 1;

            // Simpan ke ArrayList
            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            // Tampilkan hasil ronde
            System.out.println("Komputer melempar: " + daduKomputer);
            System.out.println("Pemain melempar  : " + daduPemain);

            if (daduPemain > daduKomputer) {
                menangPemain++;
                System.out.println(">>> Pemain menang di ronde ini!");
            } else if (daduPemain < daduKomputer) {
                menangKomputer++;
                System.out.println(">>> Komputer menang di ronde ini!");
            } else {
                System.out.println(">>> Seri!");
            }

            System.out.println("Skor sementara - Pemain: " + menangPemain + ", Komputer: " + menangKomputer);
            System.out.println("-------------------------------------------");
        }

        System.out.println("\n=== PERMAINAN SELESAI ===");

        // Tentukan pemenang akhir
        if (menangPemain == 5) {
            System.out.println("Pemenangnya adalah: PEMAIN!");
        } else {
            System.out.println("Pemenangnya adalah: KOMPUTER!");
        }

        // Rekap lemparan
        System.out.println("\n--- Rekap Riwayat Lemparan ---");

        System.out.println("Riwayat dadu komputer: " + riwayatKomputer);
        System.out.println("Riwayat dadu pemain  : " + riwayatPemain);

        System.out.println("\nTotal kemenangan pemain  : " + menangPemain);
        System.out.println("Total kemenangan komputer: " + menangKomputer);

        System.out.println("\nTerima kasih sudah bermain!");
    }
}

    