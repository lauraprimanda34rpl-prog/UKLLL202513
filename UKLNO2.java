/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno2;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class UKLNO2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang: ");
        
        int uang = input.nextInt();
        
        int[] pecahan = { 100000, 50000, 20000, 10000, 5000, 2000, 1000};
     
        for (int p : pecahan){
            int lembar = uang / p;
            if (lembar >  0){
                System.out.println(lembar +"Lembar"+ p);
            }
            uang = uang % p;
            }
            
        }
    }
    

