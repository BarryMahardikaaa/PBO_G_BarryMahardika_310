package com.praktikum.users;

import java.util.Scanner;
import com.praktikum.actions.AdminActions;

// Kelas Admin (sebagai subclass dari User) yang mengimplementasi interface AdminActions
public class Admin extends User implements AdminActions {
    // Atribut tambahan username dan password
    private String username;
    private String password;

    // Constructor Admin menggunakan super untuk menginisialisasi nama dan nim
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Getter dan setter untuk username dan password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Override method login() untuk memeriksa kecocokan username dan password
    @Override
    public boolean login() {
        return username.equals("admin") && password.equals("password123");
    }

    // Override method displayInfo() untuk menampilkan pesan login sukses
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Username: " + username);
        System.out.println("Login Admin berhasil!");
    }

    // Implementasi method dari interface AdminActions
    @Override
    public void manageItems() {
        // Untuk Modul 4 ini, cukup cetak pesan placeholder
        System.out.println(">>> Fitur Kelola Barang Belum Tersedia <<<");
    }

    @Override
    public void manageUsers() {
        // Untuk Modul 4 ini, cukup cetak pesan placeholder
        System.out.println(">>> Fitur Kelola Mahasiswa Belum Tersedia <<<");
    }

    // Implementasi method dari abstract class User
    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("\n==== Menu Admin ====");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
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