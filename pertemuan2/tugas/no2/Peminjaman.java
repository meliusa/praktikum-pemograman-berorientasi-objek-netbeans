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
public class Peminjaman {

    int id;
    String nama_member, nama_game;
    double harga;

    void tampilDataHasilPeminjaman() {
        System.out.println("id:" + id);
        System.out.println("nama member:" + nama_member);
        System.out.println("nama game:" + nama_game);
        System.out.println("harga:" + harga);
    }

    double hargaYangHarusDiBayar(int hari, double harga) {
        return hari * harga;
    }

}
