

import java.util.Scanner;

class Hewan {
    String nama;
    String jenis;

    public Hewan() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan Jenis Hewan : ");
        nama = myObj.nextLine();
        System.out.print("Masukkan Jenis Hewan : ");
        jenis = myObj.nextLine();
    }

    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

public class nomor4 {
    public static void main(String[] args) {
        Hewan ando = new Hewan();
        ando.tampil();
        Hewan grasa = new Hewan();
        grasa.tampil();
        Hewan arif = new Hewan();
        arif.tampil();
        Hewan reja = new Hewan();
        reja.tampil();
        Hewan agus = new Hewan();
        agus.tampil();
    }
}
