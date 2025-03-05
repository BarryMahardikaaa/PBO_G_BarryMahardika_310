import java.util.Scanner; //Mengimpor class Scanner dari paket java.util untuk membaca input dari pengguna.
import java.time.LocalDate; //Mengimpor class LocalDate dari paket java.time untuk mendapatkan tanggal saat ini.

public class PersonalData {
    public static void main(String[] args) {
        String name; //untuk menyimpan sekumpulan karakter (teks) dari variabel name.
        String genderNow; //untuk menyimpan sekumpulan karakter (teks) dari variabel genderNow.
        char gender; //untuk menyimpan karakter tunggal dari variabel gender.
        int yearOfBirth; //untuk menyimpan bilangan dari variabel yearOfBirth.
        Scanner objIn = new Scanner(System.in); //Membuat objek Scanner bernama objIn untuk membaca input dari pengguna.

        //untuk menampilkan dan membaca input nama, jenis kelamin, tahun lahir pengguna.
        System.out.print("Masukkan Nama Anda: ");
        name = objIn.nextLine();
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        gender = objIn.next().charAt(0);
        System.out.print("Masukkan Tahun Lahir: ");
        yearOfBirth = objIn.nextInt();

        //menghitung tahun berdasarkan umur pengguna.
        int year = LocalDate.now().getYear(); //untuk mendapatkan tahun saat ini dengan menggunakan LocalDate.now().getYear().
        int age = year - yearOfBirth; //menghitung umur pengguna dengan mengurangkan yearOfBirth dari tahun saat ini.

        //menentukan jenis kelamin berdasarkan inputan dari pengguna menggunakan coditional.
        if (gender == 'L' || gender == 'l') { //jika memilih L atau l maka teks yang akan muncul "laki-laki"
            genderNow = "laki-laki";
        } else if (gender == 'P' || gender == 'p') { //dan jika memilih P atau p maka teks yang akan muncul "perempuan"
            genderNow = "Perempuan";
        } else { //dan jika tidak memilih antara keduanya maka tidak akan terdeteksi
            genderNow = "ups maaf gender tidak terdeteksi";
        }

        //menampilkan output data diri setelah di input.
        System.out.println("\nData Diri: ");
        System.out.println("Nama : " + name);
        System.out.println("Jenis Kelamin : " + genderNow);
        System.out.println("Umur : " + age + " Tahun");

        //menutup scanner untuk menghindari kebocoran resource.
        objIn.close();
    }
}