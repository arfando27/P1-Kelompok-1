/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1_2;
import java.util.Scanner;

class NamaH {
    String nama;
 
    public NamaH(String n){
        nama=n;
    }
    
   public void tampilA(){
       System.out.println("Nama Hewan : " +nama);
   }
}

class JenisH {
    String jenis;

    public JenisH(String j){
        jenis=j;
    }
    
   public void tampilB(){
       System.out.println("Jenis Hewan : " +jenis);
   }
}

public class hewan {
    public static void main(String[] args) {
        NamaH ando = new NamaH("Singa");
        ando.tampilA();
        JenisH grasa = new JenisH("Karnivora");
        grasa.tampilB();
        NamaH arif = new NamaH("Gajah");
        arif.tampilA();
        JenisH reja = new JenisH("Herbivora");
        reja.tampilB();
    }
}