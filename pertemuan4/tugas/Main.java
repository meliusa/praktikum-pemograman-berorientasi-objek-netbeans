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
public class Main {

    public static void main(String[] args) {
        kasir k = new kasir();
        k.setNama("nama kasir");
        k.setEmail("email kasir");

        pelanggan p = new pelanggan();
        p.setNama("nama pelanggan");
        p.setEmail("email pelanggan");

        order o = new order(2000, 2);
        
        orderdetail od = new orderdetail(o, k, p);
        od.info();
    }
}
