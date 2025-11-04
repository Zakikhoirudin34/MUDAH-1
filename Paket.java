import java.util.Scanner;

public class Paket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Volume Paket ===");
        System.out.println("Panjang (cm) : ");
        int panjang = input.nextInt();
        System.out.println("Lebar (cm) : ");
        int lebar = input.nextInt();
        System.out.println("Tinggi (cm) : ");
        int tinggi = input.nextInt();

        System.out.println("Masukkan Berat Barang (kg) : ");
        int berat = input.nextInt();

        System.out.println("Masukkan Jarak Pengiriman (km) : ");
        int jarak = input.nextInt();
        
        int volume = panjang * lebar * tinggi;

        int biayaperKG;
        if (jarak <= 10) {
            biayaperKG = 4250;
        } else {
            biayaperKG = 6000;
        }

        int totalBiaya = berat * biayaperKG;

        if (volume > 100000) {
            totalBiaya += 50000;
        }

        System.out.println("=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Volume Paket : " + volume + " cm³");
        System.out.println("Biaya Volume Paket: " + (volume > 100000? "Rp 50000 (Biaya Tambahan)" : "Rp 0"));
        System.out.println("Berat Paket: " + berat + " kg");
        System.out.println("Jarak Pengiriman: " + jarak + " km");
        System.out.println("Biaya per kg: Rp " + biayaperKG);

        System.out.println("=============================");
        System.out.println("Total Biaya Pengiriman: Rp " + totalBiaya);
        System.out.println("Terima kasih telah menggunakan layanan kami!");
    }
}

