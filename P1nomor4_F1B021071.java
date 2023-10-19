/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

class Hewan {
    String nama;
    String jenis;

    public Hewan() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan nama Hewan : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Jenis Hewan : ");
        jenis = myObj.nextLine();
    }

    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

public class P1nomor4_F1B021071 {
    public static void main(String[] args) {
        Hewan ejak = new Hewan();
        ejak.tampil();
        Hewan grasa = new Hewan();
        grasa.tampil();
        Hewan arif = new Hewan();
        arif.tampil();
        Hewan reja = new Hewan();
        reja.tampil();
        Hewan agus = new Hewan();
        agus.tampil();
    }
}
      
      
       
       