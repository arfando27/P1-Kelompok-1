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
public class P1nomor2_F1B021071{
    public static void main(String[] args){
        binatang1 ejak = new binatang1();
        ejak.nama = "harimau";
        ejak.golongan = "karnivora";
        ejak.jenis = "vetebrata";
        ejak.nafas = "bernafas";
        ejak.kaki = 4;
        ejak.tampil();
        
        binatang1 daus = new binatang1();
        ejak.nama = "ikan";
        ejak.golongan = "omnivora";
        ejak.jenis = "invetebrata";
        ejak.nafas = "insang";
        ejak.kaki = 0;
        ejak.tampil();
        
    }
}
 