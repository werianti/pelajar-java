
import java.util.Scanner;
public class latihan4{
    public static void main(String[] args) {
        //Mengolah Input Data Sederhana
        //Menggunakan Class Scanner
        int Usia;
        String Nama, Alamat;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA PASIEN");
        System.out.println("----------");
        System.out.print("NISN : ");
        Usia = Input.nextInt();
        System.out.print("Nama : ");
        Nama = Input.next();
        System.out.print("Alamat : ");
        Alamat = Input.next();
        
        //Menampilkan nama pasien dll35
        System.out.println("DATA PASIEN");
        System.out.println("----------");
        System.out.println("NISN : " + Nama );
        System.out.println("Nama : " + Alamat);
        System.out.println("Alamat : " + Usia);
        
        

    
        
    }


}
