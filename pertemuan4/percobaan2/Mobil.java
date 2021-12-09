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
public class Mobil {

    private String merk;
    private int biaya;

    public Mobil() {

    }

    public void setMerk(String value) {
        this.merk = value;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setBiaya(int value) {
        this.biaya = value;
    }

    public int getBiaya() {
        return this.biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

}
