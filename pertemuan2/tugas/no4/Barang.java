/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.tugas.no4;

/**
 *
 * @author Asus
 */
public class Barang {

    String kode, namaBarang, hargaDasar;
    float diskon;

    int hitungHargaJual(int hargadasar, int diskon) {
        return hargadasar - (diskon * hargadasar);
    }

    void tampilData() {
        System.out.println("kode:" + kode);
        System.out.println("nama barang:" + namaBarang);
        System.out.println("harga dasar:" + hargaDasar);
        System.out.println("diskon:" + diskon);
    }

}
