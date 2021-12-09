/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.percobaan4;

/**
 *
 * @author Mely
 */
public class Penumpang {

    private String ktp, nama;

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtp(String value) {
        this.ktp = value;
    }

    public String getKtp() {
        return this.ktp;
    }

    public void setNama(String value) {
        this.nama = value;
    }

    public String getNama() {
        return this.nama;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }

}
