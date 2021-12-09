/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.percobaan3;

/**
 *
 * @author Mely
 */
public class KeretaApi {

    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String value) {
        this.nama = value;
    }

    public String getNama() {
        return this.nama;
    }

    public void setKelas(String value) {
        this.kelas = value;
    }

    public String getKelas() {
        return this.kelas;
    }

    public void setMasinis(Pegawai value) {
        this.masinis = value;
    }

    public Pegawai getMasinis() {
        return this.masinis;
    }

    public void setAsisten(Pegawai value) {
        this.asisten = value;
    }

    public Pegawai getAsisten() {
        return this.asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
//        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }

}
