//Kelas Hewan
class Hewan {
    String Nama; //Variabel untuk menyimpan Nama Hewan
    String Jenis; //Variabel untuk menyimpan Jenis Hewan
    String Suara; //Variabel untuk menyimpan Suara Hewan

    //Method
    void tampilkaninfo() {
        System.out.println("Nama: " + Nama); //Menampilkan Nama Hewan
        System.out.println("Jenis: " + Jenis); //Menampilkan Jenis Hewan
        System.out.println("Suara: " + Suara); //Menampilkan Suara Hewan
        System.out.println(); //Menampilkan baris kosong untuk memberi spasi antara Hewan1 dan Hewan2
    }
}

//Kelas Main (Driver)
public class Main {
    //Method main (Tempat Eksekusi Program Dimulai)
    public static void main (String[] args) {
        //Objek Hewan pertama
        Hewan Hewan1 = new Hewan();
        Hewan1.Nama = "Kucing"; //Menetapkan Nama hewan pertama
        Hewan1.Jenis = "Mamalia"; //Menetapkan Jenis hewan pertama
        Hewan1.Suara = "Nyann~~"; //Menetapkan Suara hewan pertama

        //Objek Hewan Kedua
        Hewan Hewan2 = new Hewan();
        Hewan2.Nama = "Anjing"; //Menetapkan Nama hewan kedua
        Hewan2.Jenis = "Mamalia"; //Menetapkan Jenis hewan kedua
        Hewan2.Suara = "Woof-Woof!!"; //Menetapkan Suara hewan kedua

        Hewan1.tampilkaninfo(); //Memanggil Method tampilkaninfo untuk output hewan pertama
        Hewan2.tampilkaninfo(); //Memanggil Method tampilkaninfo untuk output hewan kedua
    }
}