package pertemuan3;

// Deklarasi kelas publik nomor2a
public class no2 {
    // Metode utama, yang akan dieksekusi pertama kali saat program dijalankan
    public static void main(String[] args) {
        // Mendefinisikan variabel diameter lingkaran
        double diameter = 10.0;
        
        // Mendefinisikan nilai konstanta pi menggunakan konstanta yang disediakan oleh kelas Math
        double pi = Math.PI;
        
        // Menghitung keliling lingkaran
        double keliling = pi * diameter;
        
        // Mencetak hasil keliling lingkaran
        System.out.println("Keliling lingkaran dengan diameter " + diameter + " adalah: " + keliling);
    }
}
