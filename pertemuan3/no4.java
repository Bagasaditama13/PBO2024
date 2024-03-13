package pertemuan3;

// Deklarasi kelas publik nomor2c
public class no4 {
    // Metode utama, yang akan dieksekusi pertama kali saat program dijalankan
    public static void main(String[] args) {
        // Mendefinisikan diameter tabung
        double diameter = 5;
        
        // Mendefinisikan tinggi tabung
        double tinggi = 10;
        
        // Menghitung jari-jari tabung
        double radius = diameter / 2;
        
        // Mendefinisikan nilai konstanta pi menggunakan konstanta yang disediakan oleh kelas Math
        double pi = Math.PI;
        
        // Menghitung volume tabung menggunakan rumus volume tabung
        double volume = pi * Math.pow(radius, 2) * tinggi;
        
        // Mencetak hasil volume tabung
        System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah: " + volume);
    }
}
