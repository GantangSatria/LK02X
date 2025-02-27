package LK02X;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int pilihan = 0;      

        bus b1 = new bus("AE 6365 YZ", "Mercedes", 8, 1);
        b1.cekToilet();

        driver s2 = new driver();
        s2.nama = "Suprianto";
        s2.no_sim = "621823";
        b1.supir = s2;
        b1.ceksupir();

        Scanner scan = new Scanner(System.in);
        while (pilihan != 4) {
        // Menampilkan menu
        System.out.println("Menu:");
        System.out.println("1. Naik");
        System.out.println("2. Turun");
        System.out.println("3. Cek Penumpang");
        System.out.println("4. Keluar");
        
        // Meminta input dari pengguna
        System.out.print("Pilih menu (masukkan angka): ");
        pilihan = scan.nextInt();
        
        // Proses pemilihan menu
        switch (pilihan) {
            case 1:
                System.out.println("Berapa jumlah penumpang naik?");
                System.out.print("(masukkan angka): ");
                int naik = scan.nextInt();
                b1.penumpangNaik(naik);
                break;
            case 2:
                System.out.println("Berapa jumlah penumpang turun?");
                System.out.print("(masukkan angka): ");
                int turun = scan.nextInt();
                b1.penumpangTurun(turun);
                break;
            case 3:
                b1.cekPenumpang();
                break;
            case 4:
                System.out.println("Terima kasih. Program berhenti.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
        }
        }
        b1.penumpangNaik(1, "Febrian");
        b1.penumpangNaik(1, "Rayyif");
        b1.cekDaftarPenumpang();
        
        scan.close();

    }
}