package com.mycompany.uklno1;

import java.util.Scanner;

public class UKLNO1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan: ");
        int angka = input.nextInt();

                if (angka > 1000) {
            System.out.println("Keterangan: Angka lebih dari 1000");
            return; 
        }

        System.out.println("Keterangan: Angka berada pada rentang 100 hingga 1000");

        boolean prima = true;

        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                prima = false;
                break;
            }
        }

        if (prima && angka > 1) {
            System.out.println("Bilangan " + angka + " adalah bilangan prima");
        } else {
            System.out.println("Bilangan " + angka + " bukan bilangan prima");
        }
    }
}
