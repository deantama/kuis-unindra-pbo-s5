package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {
    // Inisialisasi ArrayList untuk menu Poli dan dokter di sini
    public static ArrayList<String> menuPoli = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        String namaPasien, alamatPasien, noTelpon;

        // Inisialisasi menu Poli
        menuPoli.add(""); // Indeks 0 tidak digunakan
        menuPoli.add("Poli Gigi");
        menuPoli.add("Poli Anak");
        menuPoli.add("Poli Umum");

        System.out.println("--- SELAMAT DATANG DI RUMAH SAKIT WARAS ---");
        System.out.println("===========================================");
        System.out.println();

        System.out.println("* Masukkan Data Pasien *");
        System.out.print("Masukkan Nama: ");
        namaPasien = inputan.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamatPasien = inputan.nextLine();
        System.out.print("Masukkan No Telepon: ");
        noTelpon = inputan.nextLine();

        System.out.println();
        for (int i = 1; i < menuPoli.size(); i++) {
            System.out.println(i + ". " + menuPoli.get(i));
        }
        System.out.print("Pilih Poli: ");
        int pilihanPoli = inputan.nextInt();
        inputan.nextLine(); // Membersihkan baris baru

        // Handle Poli berdasarkan pilihan pengguna
        processPoli(pilihanPoli, inputan, namaPasien, menuPoli);
    }

    public static void processPoli(int pilihanPoli, Scanner inputan, String namaPasien, ArrayList<String> menuPoli) {
        ArrayList<String> dokterPoli = new ArrayList<String>();

        // Inisialisasi dokter untuk masing-masing Poli
        switch (pilihanPoli) {
            case 1:
                dokterPoli.add("");
                dokterPoli.add("dr. Poli Gigi 1");
                dokterPoli.add("dr. Poli Gigi 2");
                dokterPoli.add("dr. Poli Gigi 3");
                break;
            case 2:
                dokterPoli.add("");
                dokterPoli.add("dr. Poli Anak 1");
                dokterPoli.add("dr. Poli Anak 2");
                dokterPoli.add("dr. Poli Anak 3");
                break;
            case 3:
                dokterPoli.add("");
                dokterPoli.add("dr. Poli Umum 1");
                dokterPoli.add("dr. Poli Umum 2");
                dokterPoli.add("dr. Poli Umum 3");
                break;
            default:
                System.out.println("Pilihan Poli tidak valid.");
                return;
        }

        System.out.println();
        for (int i = 1; i < dokterPoli.size(); i++) {
            System.out.println(i + ". " + dokterPoli.get(i));
        }
        System.out.print("Pilih Dokter: ");
        int pilihDokter = inputan.nextInt();
        inputan.nextLine(); // Membersihkan baris baru

        System.out.print("Berikan Keterangan Dokter: ");
        String keteranganDokter = inputan.nextLine();

        // Memproses biaya
        System.out.print("Masukkan Biaya Pendaftaran: ");
        int biayaPendaftaran = inputan.nextInt();
        System.out.print("Masukkan Biaya Obat: ");
        int biayaObat = inputan.nextInt();
        System.out.print("Masukkan Biaya Vitamin: ");
        int biayaVitamin = inputan.nextInt();
        System.out.print("Masukkan Biaya Dokter: ");
        int biayaDokter = inputan.nextInt();

        // Menghitung total biaya
        int totalBiaya = biayaPendaftaran + biayaObat + biayaVitamin + biayaDokter;

        System.out.println("----------------o0o------------------------");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("Poli: " + menuPoli.get(pilihanPoli));
        System.out.println("Dokter: " + dokterPoli.get(pilihDokter));
        System.out.println("Keterangan: " + keteranganDokter);

        System.out.println("Total Biaya yang harus dibayar oleh " + namaPasien + ": Rp." + totalBiaya);
    }
}
