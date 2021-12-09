/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6.percobaan2;

/**
 *
 * @author Mely
 */
public class ClassB extends ClassA {

    public int z;

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return this.z;
    }

    public void getNilaiZ() {
        System.out.println("nilai z:" + z);
    }

    public void getJumlah() {
        System.out.println("jumlah: " + (getX() + getY() + z));
    }
}
