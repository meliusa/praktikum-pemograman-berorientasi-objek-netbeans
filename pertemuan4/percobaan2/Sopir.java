/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.percobaan2;

/**
 *
 * @author Mely
 */
public class Sopir {

    private String nama;
    private int biaya;

    public Sopir() {

    }

    public void setNama(String value) {
        this.nama = value;
    }

    public String getNama() {
        return this.nama;
    }

    public void setBiaya(int value) {
        this.biaya = value;
    }

    public int getBiaya() {
        return this.biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }

}
