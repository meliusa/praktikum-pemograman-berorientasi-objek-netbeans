/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.tugas;

/**
 *
 * @author Mely
 */
public class order {

    private double harga;
    private double jumlah;

    public order(double harga, double jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void setHarga(double value) {
        this.harga = value;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setJumlah(double value) {
        this.jumlah = value;
    }

    public double getJumlah() {
        return this.jumlah;
    }

    public void info() {
        System.out.println("harga: " + harga);
        System.out.println("jumlah: " + jumlah);
    }
}
