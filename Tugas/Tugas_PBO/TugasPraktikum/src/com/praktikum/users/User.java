package com.praktikum.users;

// Abstract class User sebagai superclass
public abstract class User {
    // Encapsulation dengan private attributes
    private String nama;
    private String nim;

    // Constructor untuk inisialisasi nama dan nim
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan setter untuk atribut nama dan nim
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Abstract method login() yang akan di-implement oleh subclass
    public abstract boolean login();

    // Abstract method displayAppMenu() untuk menampilkan menu spesifik peran
    public abstract void displayAppMenu();

    // Method displayInfo() untuk menampilkan informasi pengguna
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}