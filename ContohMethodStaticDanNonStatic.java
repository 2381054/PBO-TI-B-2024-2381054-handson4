public class ContohMethodStaticDanNonStatic {

    // method static untuk menghitung luas persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }
    // method non-static untuk menampilkan pesan selamat datang
    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat Datang " + nama + "!");
    }

    public static void main(String[] args) {
        // Memanggil method static langsung melalui nama kelas
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas persegi dengan sisi 5: " + luasPersegi);

        // membuat objek dari kelas untuk memanggil method non-static
        ContohMethodStaticDanNonStatic objek = new ContohMethodStaticDanNonStatic();
        objek.tampilkanPesanSelamatDatang("John");
        objek.hitungLuasPersegi(5);

    }
}
