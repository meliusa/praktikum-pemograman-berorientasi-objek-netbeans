/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.tugas.no4;

/**
 *
 * @author Mely
 */
import java.util.Scanner;

public class testkoprasi {

    public static void main(String[] args) {
        anggota donny = new anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        Scanner asd = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukkan nominal pinjam : ");
        double pinjam = asd.nextDouble();

        System.out.println("\nMeminjam uang 10.000.000...");
        double a = donny.pinjam(pinjam);
        if (a != 0) {
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }

        Scanner asd1 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukkan nominal pinjam : ");
        double pinjam2 = asd1.nextDouble();

        System.out.println("\nMeminjam uang 4.000.000...");
        double b = donny.pinjam(pinjam2);
        if (b != 0) {
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }

        Scanner asd2 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukkan nominal angsur : ");
        double angsur1 = asd2.nextDouble();

        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(angsur1);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        Scanner asd3 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukkan nominal angsur : ");
        double angsur2 = asd3.nextDouble();

        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(angsur2);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }

}
