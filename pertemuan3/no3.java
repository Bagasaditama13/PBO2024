package pertemuan3;

// Deklarasi kelas publik nomor2b
public class no3 {
    // Metode utama, yang akan dieksekusi pertama kali saat program dijalankan
    public static void main(String[] args) {
        // Mendefinisikan panjang alas segitiga
        double alas = 6;
        
        // Mendefinisikan tinggi segitiga
        double tinggi = 8;
        
        // Menghitung luas segitiga menggunakan rumus luas segitiga siku-siku
        double luas = 0.5 * alas * tinggi;
        
        // Mencetak hasil luas segitiga
        System.out.println("Luas segitiga siku-siku dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
    }
}
