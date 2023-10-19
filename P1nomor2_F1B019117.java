/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1_2;

class binatang1{
    String nama;
    String golongan;
    String jenis;
    String nafas;
    int kaki;

    void tampil(){
        System.out.println("nama :" +nama);
        System.out.println("golongan :" +golongan);
        System.out.println("jenis :" +jenis);
        System.out.println("nafas :" +nafas);
        System.out.println("kaki :" +kaki);
        System.out.println("==================");
       
        
    }
}
public class hewan{
    public static void main(String[] args){
        binatang1 agus = new binatang1();
        agus.nama = "harimau";
        agus.golongan = "karnivora";
        agus.jenis = "vetebrata";
        agus.nafas = "bernafas";
        agus.kaki = 4;
        agus.tampil();
        
        binatang1 daus = new binatang1();
        daus.nama = "ikan";
        daus.golongan = "omnivora";
        daus.jenis = "invetebrata";
        daus.nafas = "insang";
        daus.kaki = 0;
        daus.tampil();
        
    }
}
 
      
      
      
       
       
