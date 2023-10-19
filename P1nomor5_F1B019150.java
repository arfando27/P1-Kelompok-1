package p1;

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

public class P1 {
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
