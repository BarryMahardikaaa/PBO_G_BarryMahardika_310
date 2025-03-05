import java.util.Scanner;

public class simpleLogin {
    public static void main (String[] args){
        Scanner objIn = new Scanner(System.in);

        //output choose
        System.out.println("\nPilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan choose: ");
        int choose = objIn.nextInt();
        objIn.nextLine();

        //login admin
        if (choose == 1) {
            System.out.print("Masukkan username: ");
            String username = objIn.nextLine();
            System.out.print("Masukkan password: ");
            String password = objIn.nextLine();

            //validasi
            if (username.equals("Admin310") && password.equals("Password310")) {
                System.out.println("Yey login Admin Berhasil!");
            } else {
                System.out.println("upss ngga bisa masuk, login gagal! username atau password kamu salah");
            }

            //login mahasiswa
        } else if (choose == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = objIn.nextLine();
            System.out.print("Masukkan NIM: ");
            String NIM = objIn.nextLine();

            //validasi
            if (nama.equals("Ahmad Barry Mahardika") && NIM.equals("202410370110310")) {
                System.out.println("Asikk login Mahasiswa Berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + NIM);
            } else {
                System.out.println("ahhahha ngga bisa masuk, login gagal! Nama atau NIM kamu salah!");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }

        objIn.close();
    }
}