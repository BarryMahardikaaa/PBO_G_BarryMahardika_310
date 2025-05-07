package com.praktikum.main;

import java.util.Scanner;
import com.praktikum.users.User;
import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;

// Kelas LoginSystem (sebagai program utama)
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;

        System.out.println("==== Sistem Login ====");
        System.out.println("Pilih login sebagai:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            user = new Admin("Ahmad Barry Mahardika", "202410370110310", username, password);
        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            user = new Mahasiswa(nama, nim);
        } else {
            System.out.println("Pilihan tidak valid!");
            scanner.close();
            return;
        }

        // Verifikasi login dengan polymorphism
        if (user.login()) {
            user.displayInfo();
            // Memanggil displayAppMenu() dengan polymorphism
            user.displayAppMenu();
        } else {
            System.out.println("Login gagal! Ada yang salah nih.");
        }

        scanner.close();
    }
}