
class hwn {
    String nama;
    String warna;
    String makanan,habitat;
    int umur;
    int jumlahkaki;   
}

public class hewann {

    public static void main(String[] args) {
       hwn anjing = new hwn();
       hwn babi = new hwn();

        anjing.nama= "anjing";
        anjing.warna = "hitam";
        anjing.makanan = "tulang";
        anjing.habitat = "darat";
        anjing.umur = 5;
        anjing.jumlahkaki = 4;
        
        babi.nama= "babi";
        babi.warna = "merah muda";
        babi.makanan = "kotoran";
        babi.habitat = "darat";
        babi.umur = 5;
        babi.jumlahkaki = 4;
        
      
        System.out.println("Nama Hewan : " +anjing.nama);
        System.out.println("warna Hewan : " +anjing.warna);
        System.out.println("makanan Hewan : " +anjing.makanan);
        System.out.println("habitat Hewan : " +anjing.habitat);
        System.out.println("umur Hewan : " +anjing.umur);
        System.out.println("jumlah kaki Hewan : " +anjing.jumlahkaki);

        System.out.println("------------------------------------" );
        System.out.println("Nama Hewan : " +babi.nama);
        System.out.println("warna Hewan : " +babi.warna);
        System.out.println("makanan Hewan : " +babi.makanan);
        System.out.println("habitat Hewan : " +babi.habitat);
        System.out.println("umur Hewan : " +babi.umur);
        System.out.println("jumlah kaki Hewan : " +babi.jumlahkaki);
}
}