import java.util.Scanner;

class Admin {
    String username = "Admin310";
    String password = "Password310";

    void login(String inputUsername, String inputPassword) {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Yey login Admin berhasil!");
        } else {
            System.out.println("Upss ngga bisa masuk, login gagal! Username atau Password kamu salah");
        }
    }
}

class Mahasiswa {
    String nama = "Ahmad Barry Mahardika";
    String nim = "202410370110310";

    void login(String inputNama, String inputNim) {
        if (inputNama.equals(nama) && inputNim.equals(nim)) {
            System.out.println("Asikk login Mahasiswa berhasil!");
            displayinfo();
        } else {
            System.out.println("Ngga bisa masuk, login gagal! Nama atau NIM kamu salah!");
        }
    }

    void displayinfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class simpleLogin {
    public static void main (String[] args){
        Scanner objIn = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        //output choose
        System.out.println("\nPilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int choose = objIn.nextInt();
        objIn.nextLine();

        //login admin
        if (choose == 1) {
            System.out.print("Masukkan username: ");
            String username = objIn.nextLine();
            System.out.print("Masukkan password: ");
            String password = objIn.nextLine();
            admin.login(username, password);

            //login mahasiswa
        } else if (choose == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = objIn.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = objIn.nextLine();
            mahasiswa.login(nama, nim);

        } else {
            System.out.println("Pilihan tidak valid");
        }

        objIn.close();
    }
}

