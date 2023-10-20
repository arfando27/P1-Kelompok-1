/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Tugasp1 {
    
    public static void main (String[] args){
        Scanner sc;
        sc = new Scanner (System.in);
        int harga,jumlah;
        
        System.out.print("Masukkan Jumlah Barang = ");
        harga=sc.nextInt();
        System.out.print("masukkan Harga barang = ");
        jumlah=sc.nextInt();
        System.out.print("Total Harga = "+jumlah*harga);
        System.out.println("");
        
    }
    
    
}
