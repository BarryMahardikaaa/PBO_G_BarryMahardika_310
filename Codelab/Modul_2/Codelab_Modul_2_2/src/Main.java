import java.util.Scanner; // Import library Scanner untuk membaca input dari pengguna

//kelas RekeningBank
class RekeningBank {
    //atribut atau variabel untuk menyimpan informasi rekening
    String nomorRekening; //Menyimpan nomor rekening
    String namaPemilik; //Menyimpan nama pemilik rekening
    double saldo; //Menyimpan saldo rekening
    double jumlah; //Menyimpan sementara jumlah transaksi

    //Method untuk menampilkan informasi rekening
    void tampilkaninfo(){
        System.out.println();
        System.out.println("Nomor Rekening: " + nomorRekening); //Menampilkan nomor rekening
        System.out.println("Nama Pemilik: " + namaPemilik); //Menampilkan nama pemilik
        System.out.println("Saldo Rp: " + saldo); //Menampilkan saldo rekening
    }

    //Method untuk menyetor uang ke rekening
    void setorUang () {
        //Membuat objek Scanner untuk membaca input dari pengguna
        Scanner objIn = new Scanner(System.in);

        //Menampilkan inputan untuk jumlah setoran
        System.out.print(namaPemilik + " menyetor Rp");
        jumlah = objIn.nextDouble(); //Membaca input jumlah setoran dari pengguna

        // Validasi jika jumlah setoran kurang dari atau sama dengan nol
        if (jumlah <= 0){
            System.out.println("Jumlah harus lebih besar dari nol. Silakan coba lagi.");
            return; //Mengakhiri method jika input tidak valid
        }

        saldo += jumlah; //Menambahkan jumlah setoran ke saldo
        System.out.println("Saldo sekarang: Rp" + saldo); //Menampilkan saldo terkini
    }

    //Method untuk menarik uang dari rekening
    void tarikUang() {
        //Membuat objek Scanner untuk membaca input dari pengguna
        Scanner objIn = new Scanner(System.in);

        //Menampilkan inputan untuk jumlah penarikan
        System.out.print(namaPemilik + " menarik uang sejumlah Rp");
        jumlah = objIn.nextDouble(); //Membaca input jumlah penarikan dari pengguna

        // Validasi jika jumlah penarikan kurang dari atau sama dengan nol
        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih besar dari nol. Silakan coba lagi.");
            return; //Mengakhiri method jika input tidak valid
        }

        //Validasi jika saldo mencukupi untuk penarikan
        if (saldo >= jumlah) {
            saldo -= jumlah; //Mengurangi saldo dengan jumlah penarikan
            System.out.println("(Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            //Menampilkan pesan jika saldo tidak mencukupi
            System.out.println("(Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp " + saldo);
        }
    }
}

//Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {

        //Membuat objek rekening pertama dengan informasi awal
        RekeningBank rekening1 = new RekeningBank();
        rekening1.nomorRekening = "202410370110310"; //Nomor rekening pertama
        rekening1.namaPemilik = "Ahmad Barry Mahardika"; //Nama pemilik rekening pertama
        rekening1.saldo = 500000; //Saldo awal rekening

        RekeningBank rekening2 = new RekeningBank(); //Nomor rekening kedua
        rekening2.nomorRekening = "202410370110304"; //Nama pemilik rekening kedua
        rekening2.namaPemilik = "Maulana Ibrahim"; //Saldo awal rekening kedua
        rekening2.saldo = 1000000;

        //Menampilkan informasi rekening pertama dan kedua
        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
        System.out.println();

        //Melakukan setoran pada rekening pertama dan kedua
        rekening1.setorUang();
        rekening2.setorUang();
        System.out.println();

        //Melakukan penarikan pada rekening pertama dan kedua
        rekening1.tarikUang();
        rekening2.tarikUang();

        //Menampilkan informasi rekening pertama dan kedua setelah transaksi
        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}