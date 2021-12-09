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
public class Pelanggan {

    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {

    }

    public void setNama(String value) {
        this.nama = value;
    }

    public String getNama() {
        return this.nama;
    }

    public void setMobil(Mobil value) {
        this.mobil = value;
    }

    public Mobil getMobil() {
        return this.mobil;
    }

    public void setSopir(Sopir value) {
        this.sopir = value;
    }

    public Sopir getSopir() {
        return this.sopir;
    }

    public void setHari(int value) {
        this.hari = value;
    }

    public int getHari() {
        return this.hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

}
