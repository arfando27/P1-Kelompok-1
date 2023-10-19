package p1;
class tugas {
    String nama;
    int tahun_now;
    int tahun_lahir;
    int umur;
    
    public tugas(String n, int tn, int tl){
        nama=n;
        tahun_now=tn;
        tahun_lahir=tl;
    }
    
    private int hitung(){
        umur=tahun_now-tahun_lahir;
        return umur;
    }
    
    public void tampil(){
        umur=hitung();
        System.out.println("Nama : " +nama);
        System.out.println("Tahun Sekarang : " +tahun_now);
        System.out.println("Tahun Lahir : " +tahun_lahir);
        System.out.println("Umur : " +umur);
    }
}
   
public class P1 {
    public static void main(String[] args) {
        tugas ando=new tugas("Arfando Grasanando", 2023, 2000);
        ando.tampil();
    }
}
