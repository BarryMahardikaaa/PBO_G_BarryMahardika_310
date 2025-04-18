// Kelas Admin (sebagai subclass dari User)
class Admin extends User {
    // Atribut tambahan username dan password
    private String username;
    private String password;

    // Constructor Admin menggunakan super untuk menginisialisasi nama dan nim
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // Getter dan setter untuk username dan password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Override method login() untuk memeriksa kecocokan username dan password
    @Override
    public boolean login() {
        return username.equals("admin") && password.equals("password123");
    }

    // Override method displayInfo() untuk menampilkan pesan login sukses
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Username: " + username);
        System.out.println("Login Admin berhasil!");
    }
}
