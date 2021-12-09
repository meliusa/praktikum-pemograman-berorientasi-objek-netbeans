/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.tugas.no2;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.id = 1;
        p1.nama_member = "Meliusa";
        p1.nama_game = "DragonNest SEA";
        p1.harga = 1000;

        p1.tampilDataHasilPeminjaman();
        System.out.println("harga yang harus dibayar:" + p1.hargaYangHarusDiBayar(2, p1.harga));

    }
}
