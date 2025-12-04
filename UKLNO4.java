/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno4;

/**
 *
 * @author LOQ
 */
import java.util.HashSet;
public class UKLNO4 {

    public static void main(String[] args) {
        
     int[] array = {1, 2, 3, 4, 2, 5};

        HashSet<Integer> set = new HashSet<>();
        boolean adaDuplikat = false;

        System.out.print("Array memiliki elemen duplikat: ");

        for (int nilai : array) {
           
            if (!set.add(nilai)) {
                System.out.println(nilai);
                adaDuplikat = true;
                break;              
           }
        }
        if (!adaDuplikat) {
            System.out.println("Tidak ada");
        }  
        
    }
}
