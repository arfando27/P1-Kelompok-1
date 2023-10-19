
class hwnn {
    String nama;
    String warna;
    String makanan,habitat;  
}

public class nomor1 {

    public static void main(String[] args) {
       hwn anjing = new hwn();
       hwn babi = new hwn();

        anjing.nama= "anjing";
        anjing.warna = "hitam";
        anjing.makanan = "tulang";
        
        babi.nama= "babi";
        babi.warna = "merah muda";
        babi.makanan = "kotoran";

        System.out.println("Nama Hewan : " +anjing.nama);
        System.out.println("warna Hewan : " +anjing.warna);
        System.out.println("makanan Hewan : " +anjing.makanan);


        System.out.println("------------------------------------" );
        System.out.println("Nama Hewan : " +babi.nama);
        System.out.println("warna Hewan : " +babi.warna);
        System.out.println("makanan Hewan : " +babi.makanan);
}
}