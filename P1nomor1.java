package p1;
class hewan {
    String nama;
    String golongan;
    String jenis;
    
}
public class P1 {
    public static void main(String[] args) {
       hewan ando = new hewan();

        ando.nama = "Singa";
        ando.golongan = "Karnivora";
        ando.jenis = "Vetebrata";
        System.out.println("Nama Hewan : " +ando.nama);
        System.out.println("Golongan Hewan : " +ando.golongan);
        System.out.println("Jenis Hewan : " +ando.jenis);
        
    }
    
}
