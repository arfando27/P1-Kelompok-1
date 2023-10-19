/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1_2;

class binatang {
    String nama;
    String golongan;
    String jenis;
    String bernafas;
    int kaki;
    
    void tampil(){
            System.out.println(nama);
            System.out.println(golongan);
            System.out.println(jenis);
            System.out.println(bernafas);
            System.out.println("==========");
}
    
}
public class hewan {
    public static void main(String[] args) {
       binatang agus = new binatang();
       agus.nama = "Harimau";
       agus.golongan = "Karnivora";
       agus.jenis = "Vetebrata";
       agus.bernafas = "Paru-paru";
       agus.kaki = 4;
       agus.tampil();
        
    }
    
}
 
      
      
      
       
       