package com.praktikum.users;

import java.util.Scanner;
import com.praktikum.actions.MahasiswaActions;

// Kelas Mahasiswa (sebagai subclass dari User) yang mengimplementasi interface MahasiswaActions
public class Mahasiswa extends User implements MahasiswaActions {
    // Constructor Mahasiswa menggunakan super untuk menginisialisasi nama dan nim
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override method login() untuk memeriksa kecocokan nama dan nim
    @Override
    public boolean login() {
        return getNama().equals("Ahmad Barry Mahardika") && getNim().equals("202410370110310");
    }

    // Override method displayInfo() untuk menampilkan pesan login sukses
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Login Mahasiswa berhasil!");
    }

    // Implementasi method dari interface MahasiswaActions
    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nForm Laporan Barang:");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Deskripsi Barang: ");
        String deskripsiBarang = scanner.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("\nKonfirmasi: Laporan barang " + namaBarang + " berhasil disimpan!");
    }

    @Override
    public void viewReportedItems() {
        // Untuk Modul 4 ini, cukup cetak pesan placeholder
        System.out.println(">>> Fitur Lihat Laporan Belum Tersedia <<<");
    }

    // Implementasi method dari abstract class User
    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("\n==== Menu Mahasiswa ====");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout berhasil!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}