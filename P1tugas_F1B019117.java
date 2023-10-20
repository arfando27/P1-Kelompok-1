package com.mycompany.tugas;

import java.util.Scanner;

public class kalimat{
    public static void main(String[] args){
        Scanner agus = new Scanner(System.in);
        
        System.out.println("Masukin Kalimat :");
        String kata = agus.nextLine();
        
        int panjangkalimat = kata.length();
        
        System.out.println("panjang kalimat :"+ panjangkalimat +"karakter");
        
        agus.close();
    }
}


