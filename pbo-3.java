import java.util.Scanner;

abstract class Tenda {

    public abstract void cetakData(String nama);
    public abstract void jenisTenda();
    public abstract void ukuranTenda();
    public abstract void dekorTenda();
    public abstract void cetakTotal();

}

class SewaTenda extends Tenda {

  public int pilihJenisTenda;
  public int pilihUkuranTenda;
  public int pilihDekorTenda;
  public String tampilkanJenisTenda;
  public String tampilkanUkuranTenda;
  public String tampilkanDekorTenda;
  public int tampilkanBiayaJenisTenda;
  public int tampilkanBiayaUkuranTenda;
  public int tampilkanBiayaDekorTenda;
  public int subtotal;
  public String customerName;

  public void jenisTenda() {
       System.out.println("List Jenis Tenda");
       System.out.println("1. Tenda Terpal     |||  Rp. 1.200.000");
       System.out.println("2. Tenda Umum       |||  Rp. 2.000.000");
       System.out.println("3. Tenda Pernikahan |||  Rp. 3.500.000");
       System.out.println("-------------------***------------------");
   }

  public void ukuranTenda() {
       System.out.println("List Ukuran Tenda");
       System.out.println("1. S  |||  Rp. 1.500.000");
       System.out.println("2. M  |||  Rp. 2.300.000");
       System.out.println("3. XL |||  Rp. 3.800.000");
       System.out.println("-------------------***------------------");
   }

  public void dekorTenda() {
       System.out.println("List Dekor Tenda");
       System.out.println("1. Bronze  |||  Rp. 2.000.000");
       System.out.println("2. Silver  |||  Rp. 3.000.000");
       System.out.println("3. Gold    |||  Rp. 4.500.000");
       System.out.println("-------------------***------------------");
  }

  public void cetakTotal() {
     this.subtotal = this.tampilkanBiayaJenisTenda + this.tampilkanBiayaUkuranTenda + this.tampilkanBiayaDekorTenda;
  }

  public void cetakData(String nama) {
       // cetak nama customer
       this.customerName = nama;

       // scanner jenis tenda here
       Scanner inputJenisTenda = new Scanner(System.in);

       System.out.println("");
       System.out.print("Jenis Tenda Pilihan Anda: ");
       this.pilihJenisTenda = inputJenisTenda.nextInt();

      if(this.pilihJenisTenda == 1) {
          this.tampilkanJenisTenda = "Terpal";
          this.tampilkanBiayaJenisTenda = 1200000;
       } else if(this.pilihJenisTenda == 2) {
          this.tampilkanJenisTenda = "Umum";
          this.tampilkanBiayaJenisTenda = 2000000;
       } else if(this.pilihJenisTenda == 3) {
          this.tampilkanJenisTenda = "Pernikahan";
          this.tampilkanBiayaJenisTenda = 3500000;
       } else {
          System.out.print("Jenis Tenda Tidak Tersedia");
       }

       // scanner ukuran tenda here
       Scanner inputUkuranTenda = new Scanner(System.in);

       System.out.print("Ukuran Tenda Pilihan Anda: ");
       this.pilihUkuranTenda = inputUkuranTenda.nextInt();

       if(this.pilihJenisTenda == 1) {
          this.tampilkanUkuranTenda = "S";
          this.tampilkanBiayaUkuranTenda = 1500000;
       } else if(this.pilihJenisTenda == 2) {
          this.tampilkanUkuranTenda = "M";
          this.tampilkanBiayaUkuranTenda = 2300000;
       } else if(this.pilihJenisTenda == 3) {
          this.tampilkanUkuranTenda = "XL";
          this.tampilkanBiayaUkuranTenda = 3800000;
       } else {
          System.out.print("Ukuran Tenda Tidak Tersedia");
       }

       // scanner dekor tenda here
       Scanner inputDekorTenda = new Scanner(System.in);

       System.out.print("Dekor Tenda Pilihan Anda: ");
       this.pilihDekorTenda = inputDekorTenda.nextInt();

      if(this.pilihJenisTenda == 1) {
          this.tampilkanDekorTenda = "Bronze";
          this.tampilkanBiayaDekorTenda = 2000000;
       } else if(this.pilihJenisTenda == 2) {
          this.tampilkanDekorTenda = "Silver";
          this.tampilkanBiayaDekorTenda = 3000000;
       } else if(this.pilihJenisTenda == 3) {
          this.tampilkanDekorTenda = "Gold";
          this.tampilkanBiayaDekorTenda = 4500000;
       } else {
          System.out.print("Dekor Tenda Tidak Tersedia");
       }
  }
}

 class Customer {
    public String nama;
    public String notelp;

  public void customerData() {
     Scanner input = new Scanner(System.in);

     System.out.println("**  Data Penyewa  **");
     System.out.print("Masukan Nama Penyewa: ");
     this.nama = input.nextLine();

     System.out.print("Masukan No.Telp Penyewa: ");
     this.notelp = input.nextLine();

     System.out.println("");
     System.out.println("");
   }
 }

public class MainTendaService {
    public static void main(String [] args) {
      SewaTenda sewa = new SewaTenda();
      Customer customer = new Customer();

     // clear screen console
     System.out.print('\u000C');
     System.out.println("============================================");
     System.out.println("        --- Tenda Adem Organizer ---        ");
     System.out.println("============================================");
     System.out.println("");

      // render input content customer
      customer.customerData();
      System.out.print("");
      System.out.print("");

      // render screen tenda
      sewa.jenisTenda();
      sewa.ukuranTenda();
      sewa.ukuranTenda();

      // render input content sewa tenda
      sewa.cetakData(customer.nama);
      sewa.cetakTotal();

      System.out.println("");
      System.out.println("======================================");
      System.out.println("*********   Data Pemesanan   *********");
      System.out.println("======================================");
      System.out.println("Nama Pemesanan: " + sewa.customerName);
      System.out.println("Tenda Yang Dipesan: ");
      System.out.println("1. Jenis: " + sewa.tampilkanJenisTenda);
      System.out.println("2. Ukuran: " + sewa.tampilkanUkuranTenda);
      System.out.println("3. Dekor: " + sewa.tampilkanBiayaDekorTenda);
      System.out.println("");
      System.out.println("======================================");
      System.out.println("Total Biaya " + sewa.subtotal);
      System.out.println("======================================");
   }
}
