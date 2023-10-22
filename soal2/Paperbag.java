package soal2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Paperbag {
    DecimalFormat df = new DecimalFormat();
    static Scanner sc = new Scanner(System.in);
    static private double bunga = 0.025;
    private int pilihUkuran, lamaPinjam;

    public Paperbag() {

        System.out.println("-----------<*>------------");
        System.out.println("Silahkan Masukan Data Anda");
        System.out.println("-----------<*>------------");
        System.out.println("");
        System.out.print("Masukan Nama Peminjam =");
        String nama = sc.nextLine();
        System.out.print("Masukan No. KTP Peminjam = ");
        String ktp = sc.nextLine();
        System.out.println();

        getUkuranPaperBag();
        System.out.print("Masukan Pilihan = ");
        pilihUkuran = sc.nextInt();
        System.out.print("Berapa Lama Pinjam (Bulan) =");
        lamaPinjam = sc.nextInt();
        System.out.println("=====================");
        System.out.println("Anda Memilih Paket " + getUkuran());
        System.out.println("Dengan Pinjam = " + df.format(getHarga()));
        System.out.println("Dengan Bunga = " + df.format((getHarga() * bunga * lamaPinjam)));
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("------------ Total Kewajiban Pinjaman ----------");
        System.out.println("Nama Peminjam =" + nama);
        System.out
                .println("Kewajiban Bulanan = "
                        + df.format((getHarga() + (lamaPinjam * bunga * getHarga())) / lamaPinjam));
        System.out.println("Total Pinjaman " + df.format(getHarga() + (getHarga() * bunga * lamaPinjam)));

    }

    void getUkuranPaperBag() {
        System.out.println("===================");
        System.out.println("Pilih Ukuran Karung");
        System.out.println("===================");

        System.out.println("1. XL");
        System.out.println("2. L");
        System.out.println("3. M");
    }

    int getHarga() {
        int harga = 0;
        if (pilihUkuran == 1) {
            harga = 30000000;
        } else if (pilihUkuran == 2) {
            harga = 20000000;
        } else if (pilihUkuran == 3) {
            harga = 10000000;
        }
        return harga;
    }

    String getUkuran() {
        String uk = "";
        if (pilihUkuran == 1) {
            uk = "XL";
        } else if (pilihUkuran == 2) {
            uk = "L";
        } else if (pilihUkuran == 3) {
            uk = "M";
        }
        return uk;
    }

}
