package soal2;

import java.util.Scanner;

public class Pinjaman {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("--- WELCOME TO THE SOLUTION OF MONEY ---");
        System.out.println("========================================");

        System.out.println("Silahkan Pilih Paket Pinjaman");
        System.out.println("");
        System.out.println("1. Paket Karung");
        System.out.println("2. Paket Paper Bag");
        System.out.print("Masukan Pilihan Paket : ");
        int pilih = sc.nextInt();

        if (pilih == 1) {
            new Karung();
        } else if (pilih == 2) {
            new Paperbag();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Terima Kasih sudah meminjam di THE SOLUTION OF HONEY");
        System.out.println("Pusing dengan Keuangan...Kami Solusinya ( *_* )");

    }
}
