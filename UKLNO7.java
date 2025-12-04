/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno7;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UKLNO7 {
    public static void main(String[] args) {
        
             Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jenis cookies: ");
        int jumlah = input.nextInt();
        input.nextLine(); // clear buffer

        // ArrayList untuk menyimpan data
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> hargaProduksi = new ArrayList<>();
        ArrayList<Integer> hargaJual = new ArrayList<>();
        ArrayList<Integer> jumlahTerjual = new ArrayList<>();

        // ArrayList hasil perhitungan
        ArrayList<Integer> totalBiaya = new ArrayList<>();
        ArrayList<Integer> totalPendapatan = new ArrayList<>();
        ArrayList<Integer> labaRugi = new ArrayList<>();

        // Input data cookies
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nCookies ke-" + (i + 1));

            System.out.print("Nama cookies: ");
            nama.add(input.nextLine());

            System.out.print("Harga produksi per bungkus: ");
            hargaProduksi.add(input.nextInt());

            System.out.print("Harga jual per bungkus: ");
            hargaJual.add(input.nextInt());

            System.out.print("Jumlah bungkus terjual: ");
            jumlahTerjual.add(input.nextInt());
            input.nextLine(); // clear buffer
        }

        int totalKeseluruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String cookiesLabaTertinggi = "";

        // Perhitungan
        for (int i = 0; i < jumlah; i++) {

            int biaya = hargaProduksi.get(i) * jumlahTerjual.get(i);
            int pendapatan = hargaJual.get(i) * jumlahTerjual.get(i);
            int laba = pendapatan - biaya;

            totalBiaya.add(biaya);
            totalPendapatan.add(pendapatan);
            labaRugi.add(laba);

            totalKeseluruhan += laba;

            // mencari laba tertinggi
            if (laba > labaTertinggi) {
                labaTertinggi = laba;
                cookiesLabaTertinggi = nama.get(i);
            }
        }

        // OUTPUT
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Nama Cookies | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            String status;

            if (labaRugi.get(i) > 0) status = "Laba";
            else if (labaRugi.get(i) < 0) status = "Rugi";
            else status = "Impas";

            System.out.println(
                nama.get(i) + " | " +
                "Rp" + totalBiaya.get(i) + " | " +
                "Rp" + totalPendapatan.get(i) + " | " +
                "Rp" + labaRugi.get(i) + " | " + status
            );
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalKeseluruhan);
        System.out.println("Cookies dengan Laba Tertinggi: " + cookiesLabaTertinggi +
                           " (Rp" + labaTertinggi + ")");
    }
}
   
