package p1;
class hewan {
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
public class P1 {
    public static void main(String[] args) {
       hewan ando = new hewan();
       ando.nama = "Singa";
       ando.golongan = "Karnivora";
       ando.jenis = "Vetebrata";
       ando.bernafas = "Paru-paru";
       ando.kaki = 4;
       ando.tampil();
        
    }
    
}
