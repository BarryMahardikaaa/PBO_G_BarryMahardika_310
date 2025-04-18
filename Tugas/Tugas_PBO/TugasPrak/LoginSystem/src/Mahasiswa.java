// Kelas Mahasiswa (sebagai subclass dari User)
class Mahasiswa extends User {
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
}
