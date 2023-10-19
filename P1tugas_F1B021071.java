/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class bangunruang{
    double sisi;
    double panjang;
    double tinggi;
    double lebar;
    double kbs;
    double blk;
    double alas;
    double prisma;
    double set = 0.5;
    
  public bangunruang(double s,double p,double l,double t, double a){
      sisi=s;
      panjang=p;
      tinggi=t;
      lebar=l;
      alas=a;
  }
  private double vkubus(){
      kbs=sisi*sisi*sisi;
      return kbs;
  }
  private double vbalok(){
      blk=panjang*lebar*tinggi;
      return blk;
  }
  private double vprisma(){
      prisma=set*panjang*lebar*tinggi;
      return prisma;
  }
  public void tampil(){
      kbs=vkubus();
      blk=vbalok();
      prisma=vprisma();
      System.out.println("Menghitung Volume Bangun Ruang kubus = " +vkubus());
      System.out.println("Menghitung Volume Bangun Ruang Balok = "+vbalok());
      System.out.println("Menghitung Volume Bangun Ruang Prisma = " +vprisma());
  }
}
public class tugasp1 {
      public static void main(String[] args){
          bangunruang ejak=new bangunruang(4, 5, 3, 2, 7);
          ejak.tampil();
      }
}

