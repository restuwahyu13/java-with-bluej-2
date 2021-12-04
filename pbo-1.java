import java.util.Scanner;

class KaryawanTetap {

    protected String nama;
    protected String nik;
    private int golonganA = 100000000;
    private int golonganB = 75000000;
    private int golonganC = 50000000;
    protected int nominalPinjaman;
    protected double bungaCicilan = 0.025;
    protected double bungaPerbulan;
    protected int totalPinjaman;
    protected int kewajibanPinjaman;
    protected String typePinjamanUang;
    protected int biayaCicilan;
    protected int pilihGolongan;
    protected int inputCicilan;

    public String statusKaryawan() {
       return "Karyawan Tetap";
    }

    public void biodataKaryawan() {
       System.out.println("==========================");
       System.out.println("Silahkan Masukan Data Anda");
       System.out.println("==========================");
       System.out.println("");

       Scanner input = new Scanner(System.in);

       System.out.print("Masukan Nama Peminjam: ");
       this.nama = input.nextLine();

       System.out.print("Masukan NIK Peminjam: ");
       this.nik = input.nextLine();
    }

    public void typePinjaman() {
       System.out.println("=======================");
       System.out.println("Pilih Golongan Pinjaman");
       System.out.println("=======================");
       System.out.println("1. Golongan A");
       System.out.println("2. Golongan B");
       System.out.println("3. Golongan C");
       System.out.println("");

       Scanner input = new Scanner(System.in);

       System.out.print("Masukan pilihan golongan: ");
       this.pilihGolongan = input.nextInt();

       System.out.print("Berapa Lama Pinjaman (Bulan): ");
       this.inputCicilan = input.nextInt();

       if(this.pilihGolongan == 1) {
         this.typePinjamanUang = "A";
         this.nominalPinjaman = this.golonganA;
         this.bungaPerbulan = this.golonganA * this.bungaCicilan;
         this.kewajibanPinjaman = (int)this.bungaPerbulan + (this.golonganA / this.inputCicilan);
         this.totalPinjaman = (this.kewajibanPinjaman * this.inputCicilan);
        } else if(this.pilihGolongan == 2) {
         this.typePinjamanUang = "B";
         this.nominalPinjaman = this.golonganB;
         this.bungaPerbulan = this.golonganB * this.bungaCicilan;
         this.kewajibanPinjaman = (int)this.bungaPerbulan + (this.golonganB / this.inputCicilan);
         this.totalPinjaman = (this.kewajibanPinjaman * this.inputCicilan);
        } else if(this.pilihGolongan == 3) {
         this.typePinjamanUang = "C";
         this.nominalPinjaman = this.golonganC;
         this.bungaPerbulan = this.golonganC * this.bungaCicilan;
         this.kewajibanPinjaman = (int)this.bungaPerbulan + (this.golonganC / this.inputCicilan);
         this.totalPinjaman = (this.kewajibanPinjaman * this.inputCicilan);
        } else {
          System.out.print("Jenis Pinjaman Tidak Tersedia");
        }
    }

    public void tampilkanPinjaman() {
     System.out.println("");
     System.out.println("Anda Memilih Golongan: " + this.typePinjamanUang);
     System.out.println("Dengan Pinjaman: " + this.nominalPinjaman);
     System.out.println("Dengan Bunga: " + this.bungaPerbulan);
     System.out.println("");
     System.out.println("");
     System.out.println("-------- Total Kewajiban Pinjaman --------");
     System.out.println("Nama Peminjam: " + this.nama);
     System.out.println("Kewajiban Bulanan: " + this.kewajibanPinjaman);
     System.out.println("");
     System.out.println("");
     System.out.println("Total Pinjaman: " + this.totalPinjaman);
     System.out.println("");
     System.out.println("");
     System.out.println("Terimakasih telah meminjam di koperasi PT. Koperasi Abdi Jaya");
     System.out.println("Kesejahtraan Karyawan dalam urusan Keuangan... Kami Solusinya (*_*)");
    }
}

class KaryawanHonorer extends KaryawanTetap {
    private int golonganA = 30000000;
    private int golonganB = 20000000;
    private int golonganC = 10000000;
    private int biayaCicilan;
    private int pilihGolongan;
    private int inputCicilan;

    public KaryawanHonorer() {
      super();
    }

    public String statusKaryawan() {
        return "Karyawan Honorer";
    }

    public void biodataKaryawan() {
       System.out.println("==========================");
       System.out.println("Silahkan Masukan Data Anda");
       System.out.println("==========================");
       System.out.println("");

       Scanner input = new Scanner(System.in);

       System.out.print("Masukan Nama Peminjam: ");
       this.nama = input.nextLine();

       System.out.print("Masukan NIK Peminjam: ");
       this.nik = input.nextLine();
    }

    public void typePinjaman() {
       System.out.println("=======================");
       System.out.println("Pilih Golongan Pinjaman");
       System.out.println("=======================");
       System.out.println("1. Golongan A");
       System.out.println("2. Golongan B");
       System.out.println("3. Golongan C");
       System.out.println("");

       Scanner input = new Scanner(System.in);

       System.out.print("Masukan pilihan golongan: ");
       this.pilihGolongan = input.nextInt();

       System.out.print("Berapa Lama Pinjaman (Bulan): ");
       this.inputCicilan = input.nextInt();

       if(this.pilihGolongan == 1) {
         this.typePinjamanUang = "A";
         this.nominalPinjaman = this.golonganA;
         this.bungaPerbulan = this.golonganA * this.bungaCicilan;
         this.kewajibanPinjaman = (int)this.bungaPerbulan + (this.golonganA / this.inputCicilan);
         this.totalPinjaman = (this.kewajibanPinjaman * this.inputCicilan);
        } else if(this.pilihGolongan == 2) {
         this.typePinjamanUang = "B";
         this.nominalPinjaman = this.golonganB;
         this.bungaPerbulan = this.golonganB * this.bungaCicilan;
         this.kewajibanPinjaman = (int)this.bungaPerbulan + (this.golonganB / this.inputCicilan);
         this.totalPinjaman = (this.kewajibanPinjaman * this.inputCicilan);
        } else if(this.pilihGolongan == 3) {
         this.typePinjamanUang = "C";
         this.nominalPinjaman = this.golonganC;
         this.bungaPerbulan = this.golonganC * this.bungaCicilan;
         this.kewajibanPinjaman = (int)this.bungaPerbulan + (this.golonganC / this.inputCicilan);
         this.totalPinjaman = (this.kewajibanPinjaman * this.inputCicilan);
        } else {
          System.out.print("Jenis Pinjaman Tidak Tersedia");
        }
    }

    public void tampilkanPinjaman() {
     System.out.println("");
     System.out.println("Anda Memilih Golongan: " + this.typePinjamanUang);
     System.out.println("Dengan Pinjaman: " + this.nominalPinjaman);
     System.out.println("Dengan Bunga: " + this.bungaPerbulan);
     System.out.println("");
     System.out.println("");
     System.out.println("-------- Total Kewajiban Pinjaman --------");
     System.out.println("Nama Peminjam: " + this.nama);
     System.out.println("Kewajiban Bulanan: " + this.kewajibanPinjaman);
     System.out.println("");
     System.out.println("");
     System.out.println("Total Pinjaman: " + this.totalPinjaman);
     System.out.println("");
     System.out.println("");
     System.out.println("Terimakasih telah meminjam di koperasi PT. Koperasi Abdi Jaya");
     System.out.println("Kesejahtraan Karyawan dalam urusan Keuangan... Kami Solusinya (*_*)");
    }
}

public class PinjamanUang {

   public static String typeKaryawan() {
       System.out.println("=======================");
       System.out.println("Pilih Status Karyawan");
       System.out.println("=======================");
       System.out.println("1. Karyawan Tetap");
       System.out.println("2. Karyawan Honorer");
       System.out.println("");

       Scanner input = new Scanner(System.in);

       System.out.print("Masukan pilihan status: ");

       if(input.nextInt() == 1) {
          return "Karyawan Tetap";
        } else if(input.nextInt() == 2) {
          return "Karyawan Honorer";
        } else {
          return "Karyawan Status Tidak Tersedia";
        }
   }

     public static void main(String [] args) {
      // clear screen console
      System.out.print('\u000C');
      System.out.println("---- Koperasi PT.Sejahtra Abadi Jaya ----");
      System.out.println("=========================================");
      System.out.println("");
      System.out.println("");

      // initialisasi type karyawan
      String typeKaryawan = PinjamanUang.typeKaryawan();

      // declaration constructor
      KaryawanTetap kt = new KaryawanTetap();
      KaryawanHonorer kh = new KaryawanHonorer();

      // pengecekan type karyawan
      if(typeKaryawan == kt.statusKaryawan()) {
        System.out.println("");
        kt.biodataKaryawan();
        System.out.println("");
        kt.typePinjaman();
        System.out.println("");
        kt.tampilkanPinjaman();
      } else if(typeKaryawan == kh.statusKaryawan()) {
        System.out.println("");
        kh.biodataKaryawan();
        System.out.println("");
        kh.typePinjaman();
        System.out.println("");
        kh.tampilkanPinjaman();
      } else {
        System.out.println(typeKaryawan);
      }
   }
}
