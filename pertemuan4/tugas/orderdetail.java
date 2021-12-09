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
public class orderdetail {

    private double total;
    private order order;
    private kasir kasir;
    private pelanggan pelanggan;

    public orderdetail(order order, kasir kasir, pelanggan pelanggan) {
        this.order = order;
        this.kasir = kasir;
        this.pelanggan = pelanggan;
    }

    public void setNama(double value) {
        this.total = value;
    }

    public void setOrder(order value) {
        this.order = value;
    }

    public order getOrder() {
        return this.order;
    }

    public double getTotal() {
        return this.total;
    }

    public void setKasir(kasir value) {
        this.kasir = value;
    }

    public kasir getKasir() {
        return this.kasir;
    }

    public void setPelanggan(pelanggan value) {
        this.pelanggan = value;
    }

    public pelanggan getPelanggan() {
        return this.pelanggan;
    }

    public void info() {
        System.out.println("total: " + (order.getHarga() * order.getJumlah()));
        kasir.info();
        pelanggan.info();
    }

}
