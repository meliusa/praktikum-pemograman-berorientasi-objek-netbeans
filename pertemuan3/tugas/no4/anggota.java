/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.tugas.no4;

/**
 *
 * @author Mely
 */
public class anggota {

    private String no_ktp, nama;
    private double limit_pinjaman, jumlah_pinjaman;

    public anggota() {

    }

    public anggota(String no_ktp, String nama, double limit_pinjaman) {
        this.no_ktp = no_ktp;
        this.nama = nama;
        this.limit_pinjaman = limit_pinjaman;
    }

    public void setNoKtp(String value) {
        this.no_ktp = value;
    }

    public String getNoKtp() {
        return this.no_ktp;
    }

    public void setNama(String value) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setLimitPinjaman(double value) {
        this.limit_pinjaman = value;
    }

    public double getLimitPinjaman() {
        return this.limit_pinjaman;
    }

    public void setJumlahPinjaman(double value) {
        this.jumlah_pinjaman = value;
    }

    public double getJumlahPinjaman() {
        return this.jumlah_pinjaman;
    }

    double pinjam(double nominal) {
        if (nominal > limit_pinjaman) {
            return 0;
        } else {
            jumlah_pinjaman += nominal;
            return nominal;
        }
    }

    double angsur(double nominal) {
        if (nominal < (jumlah_pinjaman * 0.1)) {
            return 0;

        } else {
            jumlah_pinjaman -= nominal;
            return jumlah_pinjaman;
        }
    }

}
