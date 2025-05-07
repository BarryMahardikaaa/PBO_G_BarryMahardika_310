package app;

public class Main {
    public static void main(String[] args) {
        perpustakaan.buku buku1 = new perpustakaan.fiksi("Harry Potter", "J.K. Rowling");
        perpustakaan.buku buku2 = new perpustakaan.nonFiksi("Sapiens", "Yuval Noah Harari");

        buku1.displayInfo();
        buku2.displayInfo();

        perpustakaan.anggota anggota = new perpustakaan.anggota("bary", "G");
        anggota.pinjamBuku("Harry Potter");
        anggota.pinjamBuku("Sapiens", 7);
        anggota.kembalikanBuku("Harry Potter");
    }
}