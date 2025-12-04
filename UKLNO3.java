/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno3;

/**
 *
 * @author LOQ
 */
import java.util.Random;
import java.util.Scanner;
public class UKLNO3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        String lanjut = "y";
        
        while(lanjut.equalsIgnoreCase("y")){
            
            int a = rand.nextInt(20)+ 1;
            int b = rand.nextInt(20)+ 1;
            int operator = rand.nextInt(3);
            
            int jawabanBenar =0;
            String simbol = "*";
            
            switch (operator){
                case 0:
                    simbol = "*";
                    jawabanBenar = a*b;
                    break;
                    
                case 1:
                    simbol = "/";
                    jawabanBenar = a%b;
                    break;
            }
            
            System.out.print(a+ " " + simbol + " "+ b + " = ");
            int jawabanUser = input.nextInt();
            
            if(jawabanUser == jawabanBenar){
                System.out.println("Benar!");
            }else{
                System.out.println("Salah. Jawaban yang benar adalah:"+jawabanBenar);            
            }
            
            System.out.print("Lanjut kuis? (y/n):");
            lanjut = input.next();
            System.out.println();
            }
        System.out.println("Terima kasih telah mengikuti kuis!");
        }
    }

