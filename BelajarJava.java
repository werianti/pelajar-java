
import java.util.Random;
import java.util.Scanner;

public class BelajarJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int angkaTebakan = random.nextInt(100) + 1;
        int tebakanUser;
        int jumlahTebakan = 0;
        
        System.out.println("Selamat datang di permainan Tebak Angka - Belajar Java!");
        System.out.println("Saya telah memilih angka antara 1 dan 100. Coba tebak!");

        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakanUser = scanner.nextInt();
            jumlahTebakan++;
            
            if (tebakanUser < angkaTebakan) {
                System.out.println("Terlalu rendah! Coba lagi.");
            } else if (tebakanUser > angkaTebakan) {
                System.out.println("Terlalu tinggi! Coba lagi.");
            } else {
                System.out.println("Selamat! Anda menebak angka yang benar!");
                System.out.println("Jumlah tebakan Anda: " + jumlahTebakan);
            }
        } while (tebakanUser != angkaTebakan);

        scanner.close();
    }
}
