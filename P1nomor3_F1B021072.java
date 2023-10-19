class hewani {
    String nama;
    String jenis;
    String golongan;
    String bernafas;
    int kaki;
    
    void tampil(){
            System.out.println(nama);
            System.out.println(jenis);
            System.out.println(golongan);
            System.out.println(kaki);
            System.out.println("==========");
}
    
}
public class nomor3{
    public static void main(String[] args) {
       hewan yadut = new hewan();
       yadut.nama = "kucing";
       yadut.golongan= "Karnivora";
       yadut.jenis = "Vetebrata";
       yadut.bernafas = "Paru-paru";
       yadut.kaki = 4;
       yadut.tampil();
        
    }
    
}
