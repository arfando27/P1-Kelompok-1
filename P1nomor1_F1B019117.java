/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package percobaan1;

class binatang {
    String nama;
    String golongan;
    String jenis;
    
}
public class hewan{
    public static void main(String[] args) {
       binatang agus = new binatang();

        agus.nama = "Harimau";
        agus.golongan = "Karnivora";
        agus.jenis = "Vetebrata";
        System.out.println("Nama Hewan : " +agus.nama);
        System.out.println("Golongan Hewan : " +agus.golongan);
        System.out.println("Jenis Hewan : " +agus.jenis);
        
    }

}
