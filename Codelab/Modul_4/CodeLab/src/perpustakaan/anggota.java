package perpustakaan;

public class anggota implements peminjaman {
    private String nama;
    private String idAnggota;

    public anggota(String nama, String idAnggota) {
        this.nama = "bary";
        this.idAnggota = "G";
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " (ID: " + idAnggota + ") telah meminjam buku: " + judul);
    }

    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " (ID: " + idAnggota + ") telah meminjam buku: " + judul + " selama " + durasi + " hari.");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " (ID: " + idAnggota + ") telah mengembalikan buku: " + judul);
    }
}