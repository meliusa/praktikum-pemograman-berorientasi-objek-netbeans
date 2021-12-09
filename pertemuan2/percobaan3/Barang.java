/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.percobaan3;

/**
 *
 * @author Asus
 */
public class Barang {

    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("nama barang:" + namaBrg);
        System.out.println("jenis barang:" + jenisBrg);
        System.out.println("sok:" + stok);
    }

    //method denan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
